package com.bajaj.backend.bajaj.Ctl;

import com.bajaj.backend.bajaj.Moldel.BajajRequestDto;
import com.bajaj.backend.bajaj.Moldel.BajajResponseDTO;
import com.bajaj.backend.bajaj.Moldel.FileDetails;
import com.bajaj.backend.bajaj.service.BajajServ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class BajajCtl {

    @Autowired
    private BajajServ service;

    @PostMapping("/bfhl")
    public ResponseEntity<BajajResponseDTO> handlePost(@RequestBody BajajRequestDto request) {
        // Extract data from service methods
        List<String> numbers = service.extractNumbers(request.getData());
        List<String> alphabets = service.extractAlphabets(request.getData());
        String highestLowercase = service.findHighestLowercase(alphabets);
        boolean isPrimeFound = service.checkForPrimes(numbers);
        FileDetails fileDetails = service.handleFile(request.getFileB64());

        // Create BajajResponseDTO object and set values
        BajajResponseDTO response = new BajajResponseDTO();
        response.setSuccess(true);
        response.setUserId("your_user_id");
        response.setEmail("your_email");
        response.setRollNumber("your_roll_number");
        response.setNumbers(numbers);
        response.setAlphabets(alphabets);
        response.setHighestLowercaseAlphabet(List.of(highestLowercase));
        response.setPrimeFound(isPrimeFound);
        response.setFileValid(fileDetails.isValid());
        response.setFileMimeType(fileDetails.getMimeType());
        response.setFileSizeKb(fileDetails.getSizeKb());

        return ResponseEntity.ok(response);
    }

    @GetMapping("/bfhl")
    public ResponseEntity<Map<String, Integer>> handleGet() {
        return ResponseEntity.ok(Map.of("operation_code", 1));
    }
}

package com.bajaj.backend.bajaj.service;

import com.bajaj.backend.bajaj.Moldel.FileDetails;
import com.bajaj.backend.bajaj.service.BajajServ;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Service
public class BajajServiceImpl implements BajajServ {

    @Override
    public List<String> extractNumbers(List<String> data) {
        List<String> numbers = new ArrayList<>();
        for (String item : data) {
            if (item.matches("\\d+")) {
                numbers.add(item);
            }
        }
        return numbers;
    }

    @Override
    public List<String> extractAlphabets(List<String> data) {
        List<String> alphabets = new ArrayList<>();
        for (String item : data) {
            if (item.matches("[a-zA-Z]")) {
                alphabets.add(item);
            }
        }
        return alphabets;
    }

    @Override
    public String findHighestLowercase(List<String> alphabets) {
        String highest = null;
        for (String letter : alphabets) {
            if (letter.matches("[a-z]")) {
                if (highest == null || letter.compareTo(highest) > 0) {
                    highest = letter;
                }
            }
        }
        return highest;
    }

    @Override
    public boolean checkForPrimes(List<String> numbers) {
        for (String numStr : numbers) {
            int num = Integer.parseInt(numStr);
            if (isPrime(num)) {
                return true;
            }
        }
        return false;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    @Override
    public FileDetails handleFile(String fileB64) {
        if (fileB64 == null || fileB64.isEmpty()) {
            return new FileDetails(false, null, 0);
        }

        try {
            byte[] fileBytes = Base64.getDecoder().decode(fileB64);
            double sizeKb = fileBytes.length / 1024.0;

            // Placeholder MIME type (implement actual MIME type detection logic)
            String mimeType = "application/octet-stream";

            return new FileDetails(true, mimeType, sizeKb);
        } catch (IllegalArgumentException e) {
            return new FileDetails(false, null, 0);
        }
    }
}

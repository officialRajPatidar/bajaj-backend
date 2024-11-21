package com.bajaj.backend.bajaj.service;

import com.bajaj.backend.bajaj.Moldel.FileDetails;

import java.util.List;

public interface BajajServ {
    List<String> extractNumbers(List<String> data);

    List<String> extractAlphabets(List<String> data);

    String findHighestLowercase(List<String> alphabets);

    boolean checkForPrimes(List<String> numbers);

    FileDetails handleFile(String fileB64);
}

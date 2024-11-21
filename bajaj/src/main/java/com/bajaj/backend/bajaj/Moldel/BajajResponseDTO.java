package com.bajaj.backend.bajaj.Moldel;

import java.util.List;

public class BajajResponseDTO {

    private boolean success;
    private String userId;
    private String email;
    private String rollNumber;
    private List<String> numbers;
    private List<String> alphabets;
    private List<String> highestLowercaseAlphabet;
    private boolean primeFound;
    private boolean fileValid;
    private String fileMimeType;
    private int fileSizeKb;

    // Getters and setters
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    public List<String> getAlphabets() {
        return alphabets;
    }

    public void setAlphabets(List<String> alphabets) {
        this.alphabets = alphabets;
    }

    public List<String> getHighestLowercaseAlphabet() {
        return highestLowercaseAlphabet;
    }

    public void setHighestLowercaseAlphabet(List<String> highestLowercaseAlphabet) {
        this.highestLowercaseAlphabet = highestLowercaseAlphabet;
    }

    public boolean isPrimeFound() {
        return primeFound;
    }

    public void setPrimeFound(boolean primeFound) {
        this.primeFound = primeFound;
    }

    public boolean isFileValid() {
        return fileValid;
    }

    public void setFileValid(boolean fileValid) {
        this.fileValid = fileValid;
    }

    public String getFileMimeType() {
        return fileMimeType;
    }

    public void setFileMimeType(String fileMimeType) {
        this.fileMimeType = fileMimeType;
    }

    public int getFileSizeKb() {
        return fileSizeKb;
    }

    public void setFileSizeKb(double fileSizeKb) {
        this.fileSizeKb = (int) fileSizeKb;
    }
}

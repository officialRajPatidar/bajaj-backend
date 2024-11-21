package com.bajaj.backend.bajaj.Moldel;

public class FileDetails {
    private boolean valid;
    private String mimeType;
    private double sizeKb;

    public FileDetails(boolean valid, String mimeType, double sizeKb) {
        this.valid = valid;
        this.mimeType = mimeType;
        this.sizeKb = sizeKb;
    }

    public boolean isValid() {
        return valid;
    }

    public String getMimeType() {
        return mimeType;
    }

    public double getSizeKb() {
        return sizeKb;
    }
}

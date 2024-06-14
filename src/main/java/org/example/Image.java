package org.example;

public class Image {
    private String image;
    private int brightness;

    public void setImageBase64(String image) {
        this.image = image;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public String getImageBase64() {
        return image;
    }

    public int getBrightness() {
        return brightness;
    }
}

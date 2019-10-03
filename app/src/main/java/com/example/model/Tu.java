package com.example.model;

public class Tu {
    private int image;
    private String position;
    private String label;
    private String sign;

    public int getImage() {
        return image;
    }

    public String getPosition() {
        return position;
    }

    public String getLabel() {
        return label;
    }

    public String getSign() {
        return sign;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Tu() {
    }

    public Tu(int image, String position, String label, String sign) {
        this.image = image;
        this.position = position;
        this.label = label;
        this.sign = sign;
    }



    public Tu(String label, String sign) {
        this.label = label;
        this.sign = sign;
    }

    public Tu(int image) {
        this.image = image;
    }

    public Tu(String position, String label, String sign) {
        this.position = position;
        this.label = label;
        this.sign = sign;
    }
}

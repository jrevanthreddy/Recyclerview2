package com.example.myapp.model;

public class Fashion {

    private String name;
    private int fashionimage;

    public Fashion(String name, int fashionimage) {
        this.name = name;
        this.fashionimage = fashionimage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFashionimage() {
        return fashionimage;
    }

    public void setFashionimage(int fashionimage) {
        this.fashionimage = fashionimage;
    }
}
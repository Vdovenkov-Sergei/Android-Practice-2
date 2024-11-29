package com.example.practice_2;

public class ItemData {
    private final String title;
    private final int image;
    private final int sound;

    ItemData(String title, int image, int sound) {
        this.title = title;
        this.image = image;
        this.sound = sound;
    }

    public int getImage() {
        return this.image;
    }

    public int getSound() {
        return this.sound;
    }

    public String getTitle() {
        return this.title;
    }
}

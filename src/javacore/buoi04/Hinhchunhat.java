package javacore.buoi04.com;

import java.util.Scanner;

public class Hinhchunhat {
    private float width;
    private float height;

    public Hinhchunhat(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getchuvi() {
        return (width + height) * 2;
    }

    public float getDientich() {
        return width * height;
    }

    public boolean check() {
        if (height == width) {
            return true;
        } else {
            return false;
        }
    }
}
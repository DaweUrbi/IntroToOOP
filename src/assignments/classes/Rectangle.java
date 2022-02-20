package week1.classes;

import java.util.Locale;

public class Rectangle {
    // fields
    private int width;
    private int height;
    private String color;


    // constructor
    public Rectangle(int width, int height) {
        if (width == 0) {
            width = 1;
        }
        this.width = width;

        if (height == 0) {
            height = 1;
        }
        this.height = height;
        color = "Blue";
    }

    public Rectangle(int width, int height, String color) {
        if (width == 0) {
            width = 1;
        }
        this.width = width;

        if (height == 0) {
            height = 1;
        }
        this.height = height;

        if (color.length() > 2 && color.length() <= 20) {
            color = color.substring(0, 1).toUpperCase() + color.substring(1);
        } else {
            color = "Blue";
        }
        this.color = color;
    }

    // Draw function
    public void draw() {
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                System.out.print(color.substring(0, 1));
            }
            System.out.println("");
        }
    }
    // setter
    public void setWidth(int width) {
        if (width == 0) {
            this.width = 1;
        } else {
            this.width = width;
        }
    }

    public void setHeight(int height) {
        if (height == 0) {
            this.height = 1;
        } else {
            this.height = height;
        }
    }

    public void setColor(String color) {
        if (color.length() > 2 && color.length() <= 20) {
            color = color.substring(0, 1).toUpperCase() + color.substring(1);
        } else {
            color = "Blue";
        }
        this.color = color;
    }
}

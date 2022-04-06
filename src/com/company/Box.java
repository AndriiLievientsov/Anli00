package com.company;

public class Box {
    private int width;
    private int height;
    private int length;
    private String material;
    private String color;

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(int width, int height, int length, String material, String color) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.material = material;
        this.color = color;
    }

    public void setWidth(int width) {
        if (width >= 1) {
            this.width = width;
        }else System.out.println("Wrong value, width");
    }

    public void setHeight(int height) {
        if (height >= 1) {
            this.height = height;
        }else System.out.println("Wrong value, height");
    }

    public void setLength(int length) {
        if (length >= 1) {
            this.length = length;
        }else System.out.println("Wrong value, length");
    }

    public void setMaterial(String material) {
            this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

     int getValue() {
        return width * height * length;
        }

       String getBoxA () {
           return "BOX 'a':" + "\n"
                + "Volume - " + getValue() + "\n"
                + "Material - " + getMaterial() + "\n"
                + "Color - " + getColor() + "\n";
       }

       String getBoxB() {
            return "BOX 'b':" + "\n" + "Volume - " + getValue();
       }
}

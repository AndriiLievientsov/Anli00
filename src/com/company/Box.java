package com.company;

public class Box {
    private int width;
    private int height;
    private int length ;
    private Material material;

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(int width, int height, int length, Material material) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.material = material;
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

    public void setMaterial(Material material) {
        this.material = material;
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

    public Material getMaterial() {
        return material;
    }

    int getValue() {
        return width * height * length;
    }

    String getBoxA () {
        return "BOX 'a':" + "\n"
                + "Volume - " + getValue() + "\n"
                + "Material - ";
    }

    String getBoxB() {
        return "BOX 'b':" + "\n" + "Volume - " + getValue() + "\n";
    }

    String getBoxC() {
        return "ColorBox 'c':" + "\n"
                + "Volume - " + getValue() + "\n"
                + "Material - ";
    }

}

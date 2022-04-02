package com.company;

public class Box {
    int width;
    int height;
    int length;

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

   int getSum() {
        return width * height * length;
   }

}

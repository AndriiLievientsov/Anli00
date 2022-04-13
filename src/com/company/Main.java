package com.company;

public class Main {
    public static void main(String[] args) {
        Box a = new Box(25,17,44,Material.WOOD);
        ColorBox b = new ColorBox(1,738,141,Material.METAL,null);

        System.out.println("Ящик мой - a : " + a);
        System.out.println("Ящик мой - b : " + b);

    }
}

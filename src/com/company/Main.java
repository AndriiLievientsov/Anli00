package com.company;

public class Main {
    public static void main(String[] args) {
        try {
            Box a = new Box(0,17,44,Material.GLASS);
            ColorBox b = new ColorBox(1,30,141,Material.METAL, Color.BLACK);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Ящик мой - a " + a);
        System.out.println("Ящик мой - b " + b);

    }
}

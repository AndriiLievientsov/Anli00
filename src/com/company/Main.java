package com.company;

public class Main {
    public static void main(String[] args) {
    Box a = new Box(0,0,0,"","");
    Box b = new Box(0,0,0);
    a.setWidth(2);
    a.setHeight(0);
    a.setLength(33);
    a.setColor("White");
    a.setMaterial("Plastic");

    b.setWidth(-55);
    b.setHeight(3);
    b.setLength(14);

    System.out.println("Box 'a' volume: " + a.getValue());
    System.out.println("Box 'b' volume: " + b.getValue());
    }
}

package com.company;

public class Main {
    public static void main(String[] args) {
    Box a = new Box(0,0,0,"","");
    Box b = new Box(0,0,0);
    a.setWidth(15);
    a.setHeight(5);
    a.setLength(33);
    a.setColor("White");
    a.setMaterial("Plastic");

    b.setWidth(99);
    b.setHeight(5);
    b.setLength(14);

    System.out.println(a.getBoxA());
    System.out.println(b.getBoxB());
    }
}

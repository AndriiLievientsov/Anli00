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
    b.setHeight(3);
    b.setLength(14);

    System.out.println("BOX 'a':" + "\n"
            + "Volume - " + a.getValue() + "\n"
            + "Material - " + a.getMaterial() + "\n"
            + "Color - " + a.getColor());

    System.out.println();

    System.out.println("BOX 'b':" + "\n" + "Volume - " + b.getValue());
    }
}

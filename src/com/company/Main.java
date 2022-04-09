package com.company;

public class Main {
    public static void main(String[] args) {
        Box a = new Box(0,0,0,Material.FOG);
        Box b = new Box(0,0,0);
        ColorBox c = new ColorBox(0,0,0,Material.FOG, Color.WHITE);

        Material s = Material.getNameMaterial(1);
        Material h = Material.getNameMaterial(3);
        Color q = Color.getColorName(1);

        a.setWidth(30);
        a.setHeight(5);
        a.setLength(33);

        b.setWidth(99);
        b.setHeight(5);
        b.setLength(14);

        c.setWidth(20);
        c.setHeight(97);
        c.setLength(3);

        System.out.println(a.getBoxA() + s.getMaterials() + "\n");
        System.out.println(b.getBoxB());
        System.out.println(c.getBoxC() + h.getMaterials() + q.getColorC());
    }
}

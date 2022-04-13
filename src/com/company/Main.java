package com.company;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(4);
        Box[] boxes = new Box[warehouse.capacity];
        Box box1 = new Box(10,26,158,Material.GLASS);
        Box box2 = new ColorBox(125,77,3,Material.METAL,Color.RED);
        Box box3 = new ColorBox(15,7,433,Material.METAL,Color.BLACK);
        Box box4 = new Box(155,216,15,Material.WOOD);

        warehouse.addBox(box1, 0);
        warehouse.addBox(box2, 1);
        warehouse.addBox(box3, 2);
        warehouse.addBox(box4, 15);


        System.out.println("Warehouse " + warehouse);

    }
}

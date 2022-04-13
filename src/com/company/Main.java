package com.company;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(5);
        Object[] array = new Object[warehouse.capacity];
        Box[] boxes = {new Box(10,44,195,Material.METAL)};

        for (int i = 0; i < array.length ; i++) {
            warehouse.addBox(boxes);
        }

        System.out.println("Мой склад " + warehouse);

    }
}

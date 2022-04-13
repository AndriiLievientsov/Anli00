package com.company;

import java.util.Arrays;

public class Warehouse {
    protected  int capacity;
    protected Box[] boxes;

    public Warehouse(int capacity) {
        try {
            if (capacity <= 0){
                throw new IllegalArgumentException("Обишка ввода данных capacity");
            }
            this.capacity = capacity;
            boxes = new Box[capacity];
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
    public Warehouse(Box[] boxes) {
        this.boxes = boxes;
    }

    @Override
    public String toString() {
        return "\n" + "Warehouse {" +
                "boxes=" + Arrays.toString(boxes) +
                '}';
    }

    public void addBox (Box[] boxes) {
        this.boxes = boxes;
    }
}

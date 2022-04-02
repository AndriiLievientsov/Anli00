package com.company;

public class Main {
    public static void main(String[] args) {
	Box a = new Box(10,20,25);
    Box b = new Box(99,17,55);
    Box c = new Box(7,12,40);
    Box d = new Box(12,22,48);
    Box f = new Box(9,37,11);

        System.out.println("Box 'a' volume: " + a.getSum());
        System.out.println("Box 'b' volume: " + b.getSum());
        System.out.println("Box 'c' volume: " + c.getSum());
        System.out.println("Box 'd' volume: " + d.getSum());
        System.out.println("Box 'f' volume: " + f.getSum());

    }
}

package com.company;

public enum Color {
    RED("Red"),
    GREEN("Green"),
    BLACK("Black"),
    WHITE("White");

    private String color;

    Color(String colors) {
        this.color = colors;
    }

    public  String getColors () {
        return color;
    }

}

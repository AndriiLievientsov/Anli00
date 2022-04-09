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
    public  static  Color getColorName (int i) {
        switch (i) {
            case 1: return Color.RED;
            case 2: return Color.GREEN;
            case 3: return Color.BLACK;
        }
        return Color.WHITE;
    }

    String getColorC() {
        return "\n" +"Color - " + getColors();
    }

}

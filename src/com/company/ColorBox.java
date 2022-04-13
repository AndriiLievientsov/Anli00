package com.company;

public class ColorBox extends Box {
    private Color color;

    public ColorBox(int width, int height, int length, Material material, Color color)  {
        super(width, height, length, material);
        try {
            if (color == null ) {
                throw new IllegalArgumentException("Ошибка цвета");
            }
            this.color = color;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "ColorBox {" +
                "width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", material=" + material +
                ", color=" + color +
                '}';
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}

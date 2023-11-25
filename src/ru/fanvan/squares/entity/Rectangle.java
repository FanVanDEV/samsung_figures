package ru.fanvan.squares.entity;

public class Rectangle extends Figure {
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float getSquare() {
        return width * height;
    }
}

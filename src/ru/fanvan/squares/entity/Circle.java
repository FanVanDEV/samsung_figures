package ru.fanvan.squares.entity;

public class Circle extends Figure {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float getSquare() {
        return (float) Math.PI * radius * radius;
    }
}

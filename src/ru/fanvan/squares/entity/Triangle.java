package ru.fanvan.squares.entity;

public class Triangle extends Figure {
    private float firstLine;
    private float secondLine;
    private float thirdLine;

    public Triangle(float firstLine, float secondLine, float thirdLine) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.thirdLine = thirdLine;
    }

    @Override
    public float getSquare() {
        float p = (this.firstLine + this.secondLine + this.thirdLine) / 2;

        return (float) Math.sqrt(p * (p - firstLine) * (p - secondLine) * (p - thirdLine));
    }
}

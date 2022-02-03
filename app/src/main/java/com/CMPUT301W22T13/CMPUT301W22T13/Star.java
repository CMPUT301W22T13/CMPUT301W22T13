package com.CMPUT301W22T13.CMPUT301W22T13;

public class Star extends Shape {
    private int points;
    private int diameter;

    public Star(int x, int y, int points, int diameter) {
        super(x, y);
        this.points = points;
        this.diameter = diameter;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}

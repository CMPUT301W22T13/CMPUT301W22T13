package com.CMPUT301W22T13.CMPUT301W22T13;

public abstract class Shape {

    protected int x;
    protected int y;
    String color = "blue";

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}

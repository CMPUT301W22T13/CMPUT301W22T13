package com.CMPUT301W22T13.CMPUT301W22T13;

public class Rectangle extends Shape{
    private int bottomSideLength;
    private int topSideLength;
    private int leftSideLength;
    private int rightSideLength;
    public Rectangle(int x, int y) {
        super(x, y);
    }
    public void setLeftSideLen(int len){
        this.leftSideLength = len;

    }
    public void setBottomSideLen(int len){
        this.bottomSideLength = len;

    }
    public void setRightSideLen(int len){
        this.rightSideLength = len;

    }
    public void setTopSideLen(int len){
        this.topSideLength = len;

    }
    public int getLeftSideLen(){
        return this.leftSideLength;

    }
    public int getRightSideLen(){
        return this.rightSideLength;

    }
    public int getBottomSideLen(){
        return this.bottomSideLength;

    }
    public int getTopSideLen(){
        return this.topSideLength;

    }
}

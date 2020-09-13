package com.company;

class Rectangle extends Shape {

    protected double width;
    protected double length;

    public Rectangle(){
        this.length=2;
        this.width=1;
        this.color="red";
        this.filled=false;

    }
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        this.length=length;
        this.width=width;
        this.filled=filled;
        this.color=color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "Rectangle: color="+color+", length/width="+length+"/"+width;
    }
}

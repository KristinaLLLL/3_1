package com.company;

class Square extends Rectangle{
    public Square(){
        this.width=this.length=1;
        this.color="white";
        this.filled=false;
    }

    public Square(double side){
        this.width=this.length=side;
    }
    public Square(double side, String color, boolean filled){
        this.width=this.length=side;
        this.color=color;
        this.filled=filled;
    }
    public double getSide(){
        return length;
    }
    public void setSide(double side){
        this.length=side;
        this.width=side;
    }
    public void setWidth(double side){
        this.width=side;
    }
    public void setLength(double side){
        this.length=side;
    }

    @Override
    public String toString() {
        return "Square: color="+color+", length/width="+length+"/"+width;
    }
}

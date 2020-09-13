package com.company;

public class Main {

    public static void main(String[] args) {
	Shape s1 = new Circle(5.5,"RED", false);
	System.out.println(s1);
	System.out.println(s1.getArea());
	System.out.println(s1.getPerimeter());
	System.out.println(s1.getColor());
	System.out.println(s1.isFilled());
	//System.out.println(s1.getRadius());-ошибка, т.к. это объект класса Shape, а в нём нет метода getRadius.

        Circle c1 =(Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape();-ошибка, т.к. класс вертуальный(не имеет реализации).

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength());-ошибка, т.к. это объект класса Shape, а в нём нет метода getLength.

        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4= new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        //System.out.println(s4.getSide);

        Rectangle r2=(Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide);-в данном классе такого метода нет

        Square sq1 = (Square) r2;
        System.out.println(sq1.getSide());
    }
}

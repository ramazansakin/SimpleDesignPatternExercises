package com.ramazansakin.designpatterns;

public class Main {

    public static void main(String[] args) {

        // Sample Test Code, you can test any of them as you like
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Adapter Design Pattern Simple Usage");
        Square square = new Square(5);
        System.out.println("Square side : " + square.getSide());
        SquareToRectangleAdapter squareToRectangleAdapter = new SquareToRectangleAdapter(square);
        System.out.println("Square to Rectangle adapter - height : " + squareToRectangleAdapter.getHeight());
        System.out.println("Square to Rectangle adapter - width  : " + squareToRectangleAdapter.getWidth());
        System.out.println("Square to Rectangle adapter - area   : " + squareToRectangleAdapter.getArea());
        System.out.println("--------------------------------------------------------------------------");


        System.out.println("Builder Design Pattern Simple Usage");
	    CodeBuilder cb = new CodeBuilder("Person").addField("name","String").addField("age", "int");
        System.out.println(cb);
        System.out.println("--------------------------------------------------------------------------");
    }
}

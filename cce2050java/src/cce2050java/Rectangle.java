/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cce2050java;

/**
 *
 * @author Mohammed
 */
public class Rectangle extends Shape2d {
    final double length;
    final double breadth;
    public Rectangle(String name,double l, double b) {
        super(name);
        length=l;
        breadth=b;
    }

    @Override
    public double getArea() {
        double area=length*breadth;
        return area;
    }

    @Override 
    public double getPerimeter() {
        double perimeter=2*(length+breadth);
        return perimeter;
    }
}

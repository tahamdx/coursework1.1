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
public class Circle extends Shape2d{
    final double radius;
    public Circle(String name, double rad) {
        super(name);
        radius=rad;
    }

    @Override
    public double getArea() {
        double area=(3.14)*radius*radius;
        return area;
    }
    
    @Override 
    public double getPerimeter() {
        double perimeter=2*(3.14)*radius;
        return perimeter;
    }
}

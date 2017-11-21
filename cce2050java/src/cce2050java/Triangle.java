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
public class Triangle extends Shape2d {
    final double side1;
    final double side2;
    final double side3;
    public Triangle(String name,double s1,double s2,double s3) {
        super(name);
        side1=s1;
        side2=s2;
        side3=s3;
    }

    @Override
    public double getArea() {
        double p=(side1+side2+side3)/2;
        double area =Math.pow((p*(p-side1)*(p-side2)*(p-side3)), 0.5);
        return area;
    }
    
    @Override
    public double getPerimeter() {
        double perimeter=side1+side2+side3;
        return perimeter;
    }
}

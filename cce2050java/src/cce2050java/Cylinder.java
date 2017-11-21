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
public class Cylinder extends Shape3d{
    final double height;
    final double radius;
    
    public Cylinder(String name, double h, double r) {
        super(name);
        height=h;
        radius=r;
    }

    
    public double getSurfaceArea() {
        double SA=(2*(3.14)*radius*height)+(2*(22.0/7.0)*radius*radius);
        return SA;
    }

    public double getVolume() {
        double Volume=(3.14)*radius*radius*height;
        return Volume;
    }
}

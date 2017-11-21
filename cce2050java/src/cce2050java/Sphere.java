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
public class Sphere extends Shape3d {
    final double radius;
    public Sphere(String name,double r) {
        super(name);
        radius=r;
    }

    
    public double getSurfaceArea() {
        double SA=4*(3.14)*radius*radius;
        return SA;
    }

    
    public double getVolume() {
        double Volume=(4.0/3.0)*(3.14)*radius*radius*radius;
        return Volume;
    }
}

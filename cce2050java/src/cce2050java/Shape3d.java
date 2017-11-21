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
public abstract class Shape3d extends ShapeMain{
     public Shape3d(String name) {
        super(name);
    }
     
    public abstract double getSurfaceArea();
     
    public abstract double getVolume();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework2050;

/**
 *
 * @author M00608647
 */
public class Circle extends Shape2d {
    
    private final double Radius;
   
    public Circle(String name, double radius){
        super(name);
        Radius = radius;
    }
    
    
    public double getArea(){
    return Math.PI*Math.pow(Radius, 2);
    }
    
    public double getPerimeter(){
    return Math.PI*(Radius * 2);
    }
}

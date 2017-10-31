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
public class Triangle extends Shape2d {
    private final double side1;
    private final double side2;
    private final double base;
    private final double height;
    
    public Triangle(String name, double s1, double s2, double s3, double hb){
        super(name);
        side1 = s1;
        side2 = s2;
        base = s3;
        height = hb;
    }
    
    
    public double perimeter(){
    return side1+side2+base; 
    }
    
    public double area(){
    return (height*base)/2;
    }
}

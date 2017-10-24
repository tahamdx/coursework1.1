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
public abstract class Shape {
    private int noOfSides;
    private String name;
    
    public int GetnumberOfSides(){
    return noOfSides;
    }
    
    public Shape(String name, int noOfSides){
    this.name = name;
    this.noOfSides = noOfSides;
    }
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
    
    public String getname(){
    return name;
    }
}

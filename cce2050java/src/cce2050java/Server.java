/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cce2050java;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author Mohammed
 */
public class Server {
    
    
    DataInputStream in;
    DataOutputStream out;
    ServerSocket server;
    Socket socket;
    
    
    public static void main(String argv[]) throws Exception {
        ServerSocket newsocket = new ServerSocket(8080);
        Socket socket = newsocket.accept();
        
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        
        ArrayList<Object>Serverside = new ArrayList<Object>();
        
        while (true) {
        ShapeMain shape = (ShapeMain)in.readObject();
        Serverside.add(shape);
        
        if (shape instanceof Shape2d){
        Shape2d trc = (Shape2d)shape;
        
        double area = trc.getArea();
        double perimeter = trc.getPerimeter();
        
        if (trc instanceof Rectangle){
        Rectangle r = (Rectangle) trc;
        System.out.println("Length of rec from client: " + r.length + "\n Breadth of rec from client: " + r.breadth);
        }
        
        else if (trc instanceof Circle){
        Circle circ = (Circle) trc;
        System.out.println("Radius of the circle: " + circ.radius);
        }
        
        else if (trc instanceof Triangle){
        Triangle trn = (Triangle) trc;
        System.out.println("Side1 of triangle: " + trn.side1);
        System.out.println("Side2 of triangle: " + trn.side2);
        System.out.println("Side 3 of triangle: " + trn.side3);
        }
        
        System.out.println("The Area of the shape is: " + area);
        System.out.println("The Perimeter of the shape is: " + perimeter + "\n \n");
        }
        
        else if (shape instanceof Shape3d){
        Shape3d cs=(Shape3d)shape;
        
        double surfacearea = cs.getSurfaceArea();
        double volume = cs.getVolume();
        
        if (cs instanceof Sphere){
        Sphere sp = (Sphere)cs;
        System.out.println("Radius of the sphere: " + sp.radius);
        }
        
        else if (cs instanceof Cylinder){
        Cylinder cy = (Cylinder)cs;
        System.out.println("Radois of the cylinder" + cy.radius);
        System.out.println("Height of the cylinder" + cy.height); 
        }
        
        System.out.println("Surface area: " + surfacearea);
        System.out.println("Volume: " + volume);
        out.writeObject(Serverside);
        }
        }
    }
    
    
    
}

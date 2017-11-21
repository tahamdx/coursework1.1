/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cce2050java;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mohammed
 */
class Client { 
    private int port;
    private String host;
    
    Client(String host, int port) {
        this.port = port;
        this.host = host; 
    }
public static void main(String argv[]) throws Exception{
    
    ObjectOutputStream outputToServer; //sending to server 
    ObjectInputStream fromServer; //recieving from server 
    
    int option = 0;
    ArrayList<Object> Shapes = new ArrayList<Object>();
    
    System.out.println("Welcome to shape shop");
    
    Socket client = new Socket("localhost", 8080);
    
    while (true){
    
        System.out.println("Choose your option:");
        System.out.println("1.Create a 2D Shape:");
        System.out.println("2.Create a 3D Shape:");
        System.out.println("3.Exit");
        Scanner op = new Scanner(System.in);
        
        option = op.nextInt();
        
        if (option == 1){
        
        System.out.println("Youve selected 2D shapes");
        System.out.println("What do you want to name your shape?");
        String name = op.next();
        
        System.out.println("What Shape do you want to create?");
        
        System.out.println("Enter the letter of the shape you want");
        System.out.println("t to create Triangle");
        System.out.println("c to create Circle");
        System.out.println("r to create Rectangle");
        System.out.println("e to exit");
        String tcre = op.next();
        
        if (tcre.equals("t")){
        System.out.println("Enter the dimensions to create your triangle:");
        System.out.println("Enter the Length for Side 1= ");
        double side1 = op.nextDouble();
        System.out.println("Enter the length for side 2= ");
        double side2 = op.nextDouble();
        System.out.println("Enter the length for side 3= ");
        double side3 = op.nextDouble();
        
        Triangle NewTri = new Triangle(name, side1, side2, side3);
        
        System.out.println("Area: " + NewTri.getArea());
        
        System.out.println("Perimeter: " + NewTri.getPerimeter());
        
        Shapes.add(NewTri);
        
        //Sending to server 
        new ObjectOutputStream(client.getOutputStream()).writeObject(Shapes);
        client.close();
        }
        else if (tcre.equals("c")){
        System.out.println("Enter the dimensions of the circle");
        System.out.println("Enter the radius: ");
        double radius = op.nextDouble();
        
        Circle newCirc = new Circle(name, radius);
        
        System.out.println("Area: " + newCirc.getArea());
        
        System.out.println("Perimeter: " + newCirc.getPerimeter());
        
        Shapes.add(newCirc);
        
        //Sending cirlce to server
         new ObjectOutputStream(client.getOutputStream()).writeObject(Shapes);
         client.close();
        }
        
        else if (tcre.equals("r")){
        System.out.println("Enter the dimensions of your rectangle: ");
        System.out.println("Enter the height of the rectangle: ");
        double height = op.nextDouble();
        System.out.println("Enter the width of the rectangle:" );
        double width = op.nextDouble();
        
        Rectangle newRec = new Rectangle(name, height, width);
        
        System.out.println("Area: " + newRec.getArea());
        
        System.out.println("Perimeter: " + newRec.getPerimeter());
        
        Shapes.add(newRec);
        
        //Sending Rectangle to the server 
         new ObjectOutputStream(client.getOutputStream()).writeObject(Shapes);
         client.close();
        }
        
        else {
        System.out.println("Invalid option");
        }
        System.exit(0);
        }
        else if (option == 2){
        System.out.println("Youve selected 3D shapes");
        System.out.println("What do you want to name the shape?");
        String name = op.next();
        
        System.out.println("Pick the 3D shape you want to create: ");
        System.out.println("Enter the letter of the shape you want: ");
        System.out.println("c for cylinder: ");
        System.out.println("s for sphere: ");
        System.out.println("e to exit");
        String cse = op.next();
        
        //Creating the 3d shapes based on option selected 
        
        if (cse.equals("c")){
        System.out.println("Enter dimensions for cylinder: ");
        System.out.println("Enter the radius: ");
        double radius = op.nextDouble();
        
        System.out.println("Enter the height: ");
        double height = op.nextDouble();
        
        Cylinder newCyl = new Cylinder(name, radius, height);
        
        System.out.println("Surface Area: " + newCyl.getSurfaceArea());
        System.out.println("Volume: " + newCyl.getVolume());
        
        Shapes.add(newCyl);
        
        //Sending cylinder to server
         new ObjectOutputStream(client.getOutputStream()).writeObject(Shapes);
         client.close();
         }
        
        else if(cse.equals("s")){
        System.out.println("Enter the dimensions for your sphere: ");
        System.out.println("Enter the radius: ");
        double radius = op.nextDouble();
        
        Sphere newSpher = new Sphere(name, radius);
        
        System.out.println("Surface area of the sphere: " + newSpher.getSurfaceArea());
        
        System.out.println("Volume of the sphere: " + newSpher.getVolume());
        
        Shapes.add(newSpher);
        
        //Sending sphere to server
         new ObjectOutputStream(client.getOutputStream()).writeObject(Shapes);
         client.close();
        }
        else {
        System.out.println("goodbye");
        }
        System.exit(0);
        }
        
        else if (option == 3){
            System.exit(0);
        } 
        
        else {
        System.out.println("INVALID INPUT");
        System.out.println();
        }
        
        
        }
    }
}




    


/*Write a Java program to create a class called Shape with a method called getArea().
Create a subclass called Rectangle that overrides the getArea() method to calculate 
the area of a rectangle.*/

package com.ClassTest;

public class Shape {
	 // Empty constructor
    public Shape() {
    }

    // Method to calculate the area (to be overridden by subclasses)
    public double getArea() {
        return 0.0;
    }
 }
class Rectangle extends Shape {
   
    public double length;
    public double width;

    // Constructor to initialize the rectangle's length and width
    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }
    // Override the method 
     public double getArea() {
        return length * width;
    }
    
}

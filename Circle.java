package com.ClassTest;

interface Drawable {
	 void draw();
	
}
class Circle implements Drawable {
	  public void draw() {
	        System.out.println("Drawing a Circle");
	       
	    }
}
class Rectangle1 implements Drawable {
	 public void draw() {
	        System.out.println("Drawing a Rectangle");
	       
	    }
}
class Triangle implements Drawable {
   
    public void draw() {
        System.out.println("Drawing a Triangle");
        
    }
}


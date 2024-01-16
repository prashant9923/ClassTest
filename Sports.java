/*  Write a java program  create a base class Sports and with method called play()
    Create 3 subclasses  football ,basketball ,Rugby. override the play method in all subclasses
     to play specific statement for each sport */



package com.ClassTest;

public class Sports {
	 public void play() {
	      
	    }   
}
class Football extends Sports {
    public void play() {
        System.out.println("Playing football");
    }
}
class Basketball extends Sports {
    @Override
    public void play() {
        System.out.println("Playing basketball");
    }
}
class Rugby extends Sports {
  
    public void play() {
        System.out.println("Playing rugby");
    }
}



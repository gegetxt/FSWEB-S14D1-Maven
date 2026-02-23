package com.workintech.cylinder;

import static java.lang.Math.*;

public class Circle {
    private double radius;
    public Circle(double radius){
        //Radius bir şekilde 0'dan küçük belirtilirse radius 0'a eşitlenmeli.
        if(radius < 0){
    this.radius=0;}else{
            this.radius=radius;
        }

    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
}

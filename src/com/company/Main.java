package com.company;
import java.util.*;


public class Main {

    public static void main (String[] args){

        Picture p = new Picture(
                new Circle(20,20,5),
                new Circle(30,20,5),
                new Rectangle(15,15,20,10)
        );

        System.out.println(p.toString());


        PicWindow q = new PicWindow("", p);

    }

}
























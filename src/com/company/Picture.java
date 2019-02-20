package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Picture  {

    private List<Shape> shapes;

    public Picture (Shape... shapes){
        this.shapes = new ArrayList<>();
        for (Shape s: shapes){
            this.shapes.add(s);
        }
    }

    public String toString (){
        StringBuilder b = new StringBuilder();
        b.append("<html><body><svg width=\"100\" height=\"100\">");

        for (Shape s: shapes){
            s.draw(b);
        }

        b.append("</svg></body></html>");
        return b.toString();
    }

    public static final Picture EMPTY_PICTURE = new Picture ();

    public void draw(Graphics2D g){
        for(Shape s : shapes){
            s.draw(g);
        }
    }

    public void add(Shape shape) {
        shapes.add(shape);
    }
}

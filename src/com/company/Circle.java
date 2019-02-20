package com.company;

import java.awt.*;

public class Circle extends Shape {

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius>0)
            this.radius = radius;
    }

    public Circle(int x, int y, int radius) {
        super(x, y);
        setRadius(radius);
    }

    public String toString (){
        return String.format("Circle: center %s, radius %d", super.toString(), getRadius());
    }


    @Override
    public void draw(StringBuilder builder) {
        builder.append(String.format("<circle cx=\"%d\" cy=\"%d\" r=\"%d\"/>", getX(), getY(), getRadius()));
    }

    @Override
    public void draw (Graphics2D g){
        int R = 2*radius;
        g.setStroke(new BasicStroke(getCont()));
        g.drawOval(getX()-radius, getY()-radius, R, R);
    }
}

package com.company;

import java.awt.*;

public class Rectangle extends Shape {

    private int witdth;
    private int hight;

    public Rectangle(int x, int y, int witdth, int hight) {
        super(x, y);
        this.witdth = witdth;
        this.hight = hight;
    }

    public int getWitdth() {
        return witdth;
    }

    public void setWitdth(int witdth) {
        if (witdth>0)
            this.witdth = witdth;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        if (hight>0)
            this.hight = hight;
    }

    public String toString (){
        return String.format("Rectangle: UL %s, height %d, width %d", super.toString(), getHight(), getWitdth());
    }

    @Override
    public void draw(StringBuilder builder) {
        builder.append(String.format("<rect x=\"%d\" y=\"%d\" height=\"%d\" width=\"%d\"/>", getX(), getY(), getHight(), getWitdth()));
    }

    @Override
    public void draw (Graphics2D g){
        g.drawRect(getX(), getY(), getWitdth(), getHight());
    }
}

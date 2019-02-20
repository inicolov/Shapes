package com.company;

public abstract class Shape implements Draw {

    private int x;
    private int y;
    private int cont;

    public Shape (int x, int y){
        this.x=x;
        this.y=y;
        this.cont = 5;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x,y); //%d е за int; %f за double, float; %.числоf - реже взичко след броят знаци в числото след запетаята. Работи за double и float; %s за стринг.
    }
}

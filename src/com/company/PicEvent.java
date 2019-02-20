package com.company;

import java.util.EventObject;

public class PicEvent extends EventObject {

    private Shape shape;

    public PicEvent(Object source) {
        super(source);
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape value) {
        if (value != null)
            this.shape = shape;
    }
}

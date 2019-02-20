package com.company;

import javax.swing.event.EventListenerList;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Picture  {

    private List<Shape> shapes;
    private EventListenerList listeners = new EventListenerList();

    public void addPictureListener(PicEventListener listener){
            listeners.add(PicEventListener.class, listener);
    }

    public void removePicListener (PicEventListener listener){
        listeners.remove(PicEventListener.class, listener);
    }

    private void fireShapeAdded (PicEvent e){
        Object[] l = (Object[])listeners.getListenerList();
        for (int i = 0; i <l.length ; i+=2) {
            if (l[i]==PicEventListener.class){
                ((PicEventListener)l[i+1]).shapeAdded(e);
            }
        }
    }



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
        PicEvent e= new PicEvent(this);
        e.setShape(shape);
        fireShapeAdded(e);
    }
}

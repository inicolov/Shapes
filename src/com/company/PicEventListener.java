package com.company;

import java.util.EventListener;

public interface PicEventListener extends EventListener {

    public void shapeAdded (PicEvent e);
    public void shapeRemoved (PicEvent e);

}

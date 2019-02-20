package com.company;

import javax.swing.*;
import java.awt.*;

public class PicView extends JPanel {

    private Picture pic;

    public PicView (Picture pic){
        setPicture (pic);
    }

    public void setPicture (Picture value){
        if (value!=null)
            this.pic=value;
        else
            this.pic=pic.EMPTY_PICTURE;
    }

    @Override
    public void paintComponent (Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        pic.draw(g2d);
    }

}

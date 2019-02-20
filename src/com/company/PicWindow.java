package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PicWindow extends JFrame {

    public PicWindow(String title, Picture p){
        super(title);
        Dimension d = new Dimension(200, 200);
        setMinimumSize(d);
        setPreferredSize(d);
        setMaximumSize(d);
        setVisible(true);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(new PicView(p), BorderLayout.CENTER);
        JPanel pnlButtons = new JPanel();
        pnlButtons.setLayout(new BoxLayout(pnlButtons, BoxLayout.Y_AXIS));
        JButton btnAddCircle = new JButton("Add Circle");
        pnlButtons.add(btnAddCircle);
        btnAddCircle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p.add(new Circle(50, 50, 50));
                invalidate();
                repaint();
            }
        });
        getContentPane().add(pnlButtons, BorderLayout.EAST);
    }

    public PicWindow (){

        this("", Picture.EMPTY_PICTURE);
    }


}

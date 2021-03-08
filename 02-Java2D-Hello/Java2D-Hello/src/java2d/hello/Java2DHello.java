/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2d.hello;

/**
 *
 * @author leocb
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class Java2DHello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Hello2DFrame frame = new Hello2DFrame();
         frame.setVisible(true);
    }
    
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World!");
        this.setSize(500, 500);
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        //modificação 1 - alterar a cor de fundo
        g2d.setBackground(Color.black);
        g2d.fillRect(0, 0, getWidth(), getHeight());
        g2d.setPaint(Color.red);
        int w = getWidth();
        int h = getHeight();
        g2d.drawLine(10,10, w,h);
        g2d.drawLine(70,h, w,70);
        //modificação 2 - criar elipse
        g2d.draw(new Ellipse2D.Double(0.5, 0.5, w,h));
    }
}
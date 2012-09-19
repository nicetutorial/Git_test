/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import gui.*;
import javax.swing.JFrame;

/**
 *
 * @author adopleb
 */
public class Main {

    public static void main(String args[]) {
        System.out.println("repariert und zweiten Frame eingebaut");
        JFrame frame = new Frame();
        frame.setVisible(true);
        JFrame frame2 = new Frame2();
        frame2.setVisible(true);        

    }
}

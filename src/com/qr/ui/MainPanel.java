/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qr.ui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author amnesia
 */
public class MainPanel {

    JFrame frame;
    JPanel jPanel;

    public MainPanel() {
        frame = new JFrame("QR Board Library");
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(2,2));
        getPanel();
    }

    public void getPanel() {
        JPanel squares[][] = new JPanel[8][8];
        jPanel = new JPanel();
        jPanel.setSize(20, 20);
        jPanel.setLayout(new GridLayout(2, 2));
        squares[0][0] = new JPanel();
        squares[0][0].setBackground(Color.white);
        jPanel.add(squares[0][0]);
        squares[0][1] = new JPanel();
        squares[0][1].setBackground(Color.black);
        jPanel.add(squares[0][1]);
        squares[1][0] = new JPanel();
        squares[1][0].setBackground(Color.white);
        jPanel.add(squares[1][0]);
        squares[1][1] = new JPanel();
        squares[1][1].setBackground(Color.black);
        jPanel.add(squares[1][1]);
        
        squares[0][2] = new JPanel();
        squares[0][2].setBackground(Color.white);
        jPanel.add(squares[0][2]);
        squares[0][3] = new JPanel();
        squares[0][3].setBackground(Color.black);
        jPanel.add(squares[0][3]);
        squares[1][2] = new JPanel();
        squares[1][2].setBackground(Color.black);
        jPanel.add(squares[1][2]);
        squares[1][3] = new JPanel();
        squares[1][3].setBackground(Color.black);
        jPanel.add(squares[1][3]);
        
        squares[0][4] = new JPanel();
        squares[0][4].setBackground(Color.white);
        jPanel.add(squares[0][4]);
        squares[0][5] = new JPanel();
        squares[0][5].setBackground(Color.black);
        jPanel.add(squares[0][5]);
        squares[1][4] = new JPanel();
        squares[1][4].setBackground(Color.white);
        jPanel.add(squares[1][4]);
        squares[1][5] = new JPanel();
        squares[1][5].setBackground(Color.black);
        jPanel.add(squares[1][5]);
        /*
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new JPanel();

                if ((i + j) % 2 == 0) {
                    squares[i][j].setBackground(Color.black);
                } else {
                    squares[i][j].setBackground(Color.white);
                }
                frame.add(squares[i][j]);
            }
        }
         */
        
        frame.add(jPanel);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        new MainPanel();
    }
}

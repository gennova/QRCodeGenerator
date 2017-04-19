/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui.controller;

import javax.swing.JFrame;

import javax.swing.*;
import java.awt.*;

public final class board2 {

    JFrame frame;
    JPanel squares[][] = new JPanel[8][8];

    public board2(int data[]) {
        frame = new JFrame("QR Board Library");
        frame.setSize(200, 200);
        frame.setLayout(new GridLayout(4, 4));
        
    }

    public JPanel[][] getDrawPanel() {
        squares[2][2] = new JPanel();
        squares[0][0].setBackground(Color.white);
        squares[0][1].setBackground(Color.black);
        squares[1][0].setBackground(Color.white);
        squares[1][1].setBackground(Color.black);
        return squares;
    }

    public board2() {
        frame = new JFrame("QR Board Library");
        frame.setSize(200, 200);
        frame.setLayout(new GridLayout(2, 2));
        squares[0][0] = new JPanel();
        squares[0][0].setBackground(Color.white);
        frame.add(squares[0][0]);
        squares[0][1] = new JPanel();
        squares[0][1].setBackground(Color.black);
        frame.add(squares[0][1]);
        squares[1][0] = new JPanel();
        squares[1][0].setBackground(Color.white);
        frame.add(squares[1][0]);
        squares[1][1] = new JPanel();
        squares[1][1].setBackground(Color.black);
        frame.add(squares[1][1]);
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

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new board2();
    }
}

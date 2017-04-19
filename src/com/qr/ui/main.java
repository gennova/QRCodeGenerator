/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qr.ui;

import com.ui.controller.Converter;
import java.math.BigInteger;
import java.util.Arrays;

/**
 *
 * @author amnesia
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "java";  // or anything else
        System.out.println(Converter.getAscii(str));
        System.out.println(Arrays.toString(Converter.getAsciiArray(str)));
        System.out.println(Converter.stringToHex(str));
        System.out.println(6%8);
    }

}

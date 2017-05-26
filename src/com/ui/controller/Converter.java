/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui.controller;

import java.math.BigInteger;
import java.util.Arrays;

/**
 *
 * @author amnesia
 */
public class Converter {

    public static final String getAscii(String word) {
        String teks = "";
        // converting String to ASCII value in Java
        try {
            // translating text String to 7 bit ASCII encoding
            byte[] bytes = word.getBytes("US-ASCII");
            //System.out.println(Arrays.toString(bytes));
            teks = Arrays.toString(bytes);
            /*
            System.out.println(bytes.length);
            for (int i = 0; i < bytes.length; i++) {
                System.out.println(bytes[i]);
            }
             */
        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return teks;
    }

    public static final byte[] getAsciiArray(String word) {
        byte[] bytes = null;
        // converting String to ASCII value in Java
        try {
            // translating text String to 7 bit ASCII encoding
            bytes = word.getBytes("US-ASCII");
            //System.out.println(Arrays.toString(bytes));
            /*
            System.out.println(bytes.length);
            for (int i = 0; i < bytes.length; i++) {
                System.out.println(bytes[i]);
            }
             */
        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return bytes;
    }

    public static String stringToHex(String base) {
        StringBuffer buffer = new StringBuffer();
        int intValue;
        for (int x = 0; x < base.length(); x++) {
            int cursor = 0;
            intValue = base.charAt(x);
            String binaryChar = new String(Integer.toBinaryString(base.charAt(x)));
            for (int i = 0; i < binaryChar.length(); i++) {
                if (binaryChar.charAt(i) == '1') {
                    cursor += 1;
                }
            }
            if ((cursor % 2) > 0) {
                intValue += 128;
            }
            buffer.append(Integer.toHexString(intValue) + " ");
        }
        return buffer.toString();
    }
}

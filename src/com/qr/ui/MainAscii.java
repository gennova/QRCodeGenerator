/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qr.ui;

import javax.swing.JOptionPane;

/**
 *
 * @author amnesia
 */
public class MainAscii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = JOptionPane.showInputDialog("Tuliskan karakter yang ingin anda ubah");

        //untuk mengambil masing2 karakter dari str ::
        //dengan cara merubah string tersebut menjadi array cahr
        char[] arrCharStr = str.toCharArray(); // array char of string
        int[] multi = new int[64]; // array ascii of char
        int[][] nilaidesimal = new int[64][64]; // array desimal character

        int[][] nilaiokta = new int[64][16];
        int test = 0;
        int beda = 1;
        //untuk mengambil nilai ascii dari char ::
        System.out.println("==Bilangan ASCII==");
        for (char c : arrCharStr) {
            multi[test] = (int) c;
            System.out.println(c + " = " + (int) c);
            test++;
        }

        System.out.println("Nilai test " + test);

        for (int i = 0; i < test; i++) {
            int look = multi[i] / 7;
            int modul = multi[i] % 7;
            int hitung1 = multi[i] - modul;
            int nilaia = hitung1 / 7 - (3 * beda);
            System.out.println(i + " test hasil " + multi[i] + " " + look + " " + modul + " " + hitung1 + " " + nilaia);
            System.out.println();
            for (int j = 0; j < 7; j++) {
                nilaidesimal[i][j] = nilaia + (j * beda);
                System.out.print(" Desimal " + nilaidesimal[i][j]);
            }
            System.out.println();
            //for (int k = 0; k < test; k++) {
                int tol = 0;
                for (int l = 0; l < 14; l = l + 2) {
                    nilaiokta[i][l] = nilaidesimal[i][tol] / 8;
                    nilaiokta[i][l + 1] = nilaidesimal[i][tol] % 8;
                    System.out.print(" " + nilaiokta[i][l] + " " + nilaiokta[i][l + 1]);
                    tol++;
                }
                nilaiokta[i][14] = 0;
                nilaiokta[i][15] = multi[i] % 7;
                System.out.print(" "+nilaiokta[i][14]+" "+nilaiokta[i][15]);		
            //}
            System.out.println("");
        }
        System.out.println("Menampilkan tabel okta : ");
        System.out.println(nilaiokta.length);
        for (int i = 0; i < 64; i++) {
            for (int j = 0; j < 16; j++) {
                System.out.print(nilaiokta[i][j]+" ");
            }
            System.out.println("");
        }
        /*
		for(int bug=0;bug<32;bug=bug+8)
		{
			for(int hurufz=0;hurufz<32;hurufz=hurufz+8)
			{
				for(int datas=0;datas<8;datas=datas+2)
				{
					for(int x=0;x<8;x=x+2)
					{
								
					}	
				}
			}		
		}
		//BufferedImage hasil = new BufferedImage(newcolumn,newrow,BufferedImage.TYPE_INT_RGB);
         */
    }

}

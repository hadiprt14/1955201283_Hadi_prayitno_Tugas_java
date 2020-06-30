/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author LENOVO 330
 */
public class TugasScanner {
    
    //TEMA
    //mengisi ukuran semua badan
    public static void main(String[] args) throws IOException {
        //Variabel
        String nama = "" ;
        int umur  = 0;
        double BeratBadan = 0;
        int TinggiBadan = 0;
        int Ukuran, sandal, sepatu, baju, celana, peci = 0;
        
        //Object InputStream
        InputStreamReader isr = new InputStreamReader(System.in);
        
        //object Scanner
        Scanner br = new Scanner(isr);
        
        //Input
        System.out.println("Siapa nama kamu?");
        nama = br.next();
        
        System.out.println("Umur kamu berapa?");
        Scanner inputUser = new Scanner(System.in);
        umur = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berat badan kamu?");
        inputUser = new Scanner(System.in);
        BeratBadan = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berapa tinggi badan kamu?");
        inputUser = new Scanner(System.in);
        TinggiBadan = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berapa ukuran sandal kamu?");
        inputUser = new Scanner(System.in);
        int ukuran;sandal = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berapa ukuran sepatu kamu?");
        inputUser = new Scanner(System.in);
        sepatu = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berapa ukuran baju kamu?");
        inputUser = new Scanner(System.in);
        baju = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berapa ukuran celana kamu?");
        inputUser = new Scanner(System.in);
        celana = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berapa ukuran peci kamu?");
        inputUser = new Scanner(System.in);
        peci = Integer.parseInt(inputUser.nextLine());
        
        //Output
        System.out.println("berikut spesifikasi diri kamu");
        
        System.out.println("nama : " + nama);
        
        System.out.println("umur : " + umur);
        
        System.out.println("berat badan : " + BeratBadan + " Kg");
        
        System.out.println("tinggi badan : " + TinggiBadan + " Cm");
        
        System.out.println("ukuran sandal : " + sandal);
        
        System.out.println("ukuran sepatu : " + sepatu);
        
        System.out.println("ukuran baju : " + baju);
        
        System.out.println("ukuran celana : " + celana);
        
        System.out.println("ukuran peci : " + peci);
    }

}
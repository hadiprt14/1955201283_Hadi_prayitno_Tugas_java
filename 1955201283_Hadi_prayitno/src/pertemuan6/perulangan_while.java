/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

import java.util.Scanner;

/**
 *
 * @author LENOVO 330
 */
public class perulangan_while {
   
    //TEMA
    //Menanyakan apakah sudah mandi sudah mandi
    public static void main(String[] args) {

        //Variabel
        boolean mandi = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);
        
        //Input
        while( mandi ){
            System.out.println("apakah kamu sudah mandi ?");
            System.out.println("jawab [YA/TIDAK]");
            
            jawab = scan.nextLine();
            
            if( jawab.equalsIgnoreCase("YA") ){
                mandi = false;
            }
        //Output
            counter++;
        }
        System.out.println("anda sudah melakukan perulangan  "+ counter +"  kali");
    }
}
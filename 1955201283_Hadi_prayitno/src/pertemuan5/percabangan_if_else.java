/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

import java.util.Scanner;


/**
 *
 * @author LENOVO 330
 */
public class percabangan_if_else {
    
    //TEMA
    //progam cek Nilai Ipk Dan Kelulusan Ujian Smester (ganjil / genap)
    public static void main(String[] args) {
        //variabel
        double ipk =0;
        int smester;
        String nama, grade;
        Scanner scan = new Scanner(System.in);
        
        //Input
        System.out.println("Nama : ");
        nama = scan.nextLine();
        System.out.println("Smester : ");
        smester = scan.nextInt();
        System.out.println("Nilai : ");
        ipk = scan.nextDouble();
        
        //cek apakah kamu lulus atau tidak
        //Output
        
        if ( ipk >= 9){
            grade = "A+";
            System.out.println("Keterangan Nilai : " + grade + "(Sangat Baik)" +
                             "\ncatatan          : Pertahankan");
            System.out.println("selamat  " +     nama  + ", Anda lulus UJIAN");
            System.out.println("Anda dinyatakan  : (Naik smester)");
        
        } else if( ipk >= 8 ){
            grade = "A";
            System.out.println("Keterangan Nilai : " + grade + " (Baik)" + 
                             "\ncatatan          : Pertahankan");
            System.out.println("selamat  " +     nama  + ", Anda lulus UJIAN");
            System.out.println("Anda dinyatakan  : (Naik smester)");
        
        } else if( ipk >= 7){
            grade = "B";
            System.out.println("Keterangan Nilai : " + grade + " (Cukup Baik)" + 
                             "\ncatatan          : Harus lebih belajar lagi");
            System.out.println("selamat  " +     nama  + ", Anda lulus UJIAN");
            System.out.println("Anda dinyatakan  : (Naik smester)");
            
        }else if(ipk >= 6){
            grade = "C";
            System.out.println("Keterangan Nilai : " + grade + " (Kurang Baik)" +
                             "\ncatatan          : Perbanyak belajar");
            System.out.println("selamat  " +     nama  + ", Anda lulus UJIAN");
            System.out.println("anda dinyatakan  : (Naik smester)");
            
        }else {
            grade = "D";
            System.out.println("Keterangan Nilai : " + grade + " (Buruk)" + 
                             "\ncataan           : Harus lebih giat belajar");
            System.out.println("maaf   " + nama + ", Anda tidak lulus UJIAN");
            System.out.println("Anda dinyatakan  : (Mengulang UJIAN)");
            
        }
    }
 
}

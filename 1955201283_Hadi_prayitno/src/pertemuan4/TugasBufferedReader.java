/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author LENOVO 330
 */
public class TugasBufferedReader {
 /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    
    //TEMA
    //mengisi identitas
    public static void main(String[] args) throws IOException {
        // VARIABEL nama untuk di inputkan
        String nama = "";
        String prodi = "";
        int nim = 0;
        double absen = 0; 
        String lahir = "";
        String hobi = "";
        String darah = "";
        String status = "";
        String agama = "";
        String alamat = "";
                 
        //Object InputStream
        InputStreamReader isr = new InputStreamReader(System.in);
       
        //object BufferedReader
        BufferedReader br = new BufferedReader(isr);
        
        //Input
        System.out.println("Siapa nama kamu?");
        nama = br.readLine();
        
        System.out.println("masukkan prodi kamu?");
        prodi = br.readLine();
        
        System.out.println("Isi NO.NIM kamu");
        nim = Integer.parseInt(br.readLine());
        
        System.out.println("berapa N0.Absen kamu?");
        absen = Double.parseDouble(br.readLine());
        
        System.out.println("Masukan tempat / tanggal lahir kamu?");
        lahir = br.readLine();
        
        System.out.println("Apa hobi kamu?");
        hobi = br.readLine();
        
        System.out.println("Apa golongan darah kamu?");
        darah = br.readLine();
        
        System.out.println("Apa status perkawinan kamu : sudah kawin / belum kawin?");
        status = br.readLine();
        
        System.out.println("Apa agama kamu : Islam,Katolik,Kristen,Hindu,Budha,Konghuju,Ateis?");
        agama = br.readLine();
        
        System.out.println("Di mana alamat rumah kamu?");
        alamat = br.readLine();
        
        
        //Output
        System.out.println("ini adalah biodata kamu");
        
        System.out.println("Nama : " + nama);
        
        System.out.println("Prodi : " + prodi);
        
        System.out.println("NIM : " + nim);
        
        System.out.println("NO.Absen : " + absen);
        
        System.out.println("Tempat Tanggal Lahir : " + lahir);
        
        System.out.println("Hobi : " + hobi);
        
        System.out.println("Golongan Darah : " + darah);
        
        System.out.println("Status Perkawinan : " + status);
        
        System.out.println("Agama : " + agama);
        
        System.out.println("Alamat : " + alamat);
        
        
        
    }
}
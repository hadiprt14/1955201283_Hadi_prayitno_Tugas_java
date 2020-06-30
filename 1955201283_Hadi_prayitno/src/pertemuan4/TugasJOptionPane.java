/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO 330
 */
public class TugasJOptionPane {
    //TEMA
    //Wawancara seputar kuliah
    public static void main(String[] args) {
        
        //variabel
        double pertanyaan, selesai;
        int input;
        String nama,tanyasatu, tanyadua, tanyatiga, tanyaempat, tanyalima, tanyaenam;

        //Input 
        
        nama = JOptionPane.showInputDialog("siapa Nama anda ?");
        
        //Output
       
        JOptionPane.showMessageDialog(null, "Nama anda : " + nama);
        
        //Input
        
        input = JOptionPane.showConfirmDialog(null, "Tekan OK jika ingin melanjutkan", "Bukan pertanyaan biasa", JOptionPane.DEFAULT_OPTION);
        pertanyaan = JOptionPane.showConfirmDialog(null, "anda sudah siap untuk menjawab 0.5 \n pertanyaan yang akan anda jawab dengan sejujur-nya");
        tanyasatu = JOptionPane.showInputDialog("anda (LAKI-LAKI) atau (PEREMPUAN) !");
        
        //Output
        
        input = JOptionPane.showConfirmDialog(null, "" + tanyasatu , "konfirmasi jawaban anda", JOptionPane.YES_NO_CANCEL_OPTION);
        JOptionPane.showMessageDialog(null, "anda : " + tanyasatu);
        
        //Input
        //pertanyaan pertama
        tanyadua = JOptionPane.showInputDialog("Apa motifasi anda untuk kuliah di UNIVERSITAS NAHDLATUL ULAMA BLITAR !");
        
        //Output
       
        input = JOptionPane.showConfirmDialog(null, "" + tanyadua , "konfirmasi jawaban anda", JOptionPane.YES_NO_CANCEL_OPTION);
        JOptionPane.showMessageDialog(null, "jawaban : " + tanyadua);
        
        //Input
        //pertanyaan ke dua
        tanyatiga = JOptionPane.showInputDialog("Apa Prodi atau Fakultas yang anda ambil !");
        
        //Output
       
        input = JOptionPane.showConfirmDialog(null, "" + tanyatiga , "konfirmasi jawaban anda", JOptionPane.YES_NO_CANCEL_OPTION);
        JOptionPane.showMessageDialog(null, "jawaban : " + tanyatiga);
       
        //Input
        //pertanyaan ke tiga
        tanyaempat = JOptionPane.showInputDialog("Apa Mata Kuliah yang Anda favoritkan(suka) selama kuliah !");
        
        //Output
        
        input = JOptionPane.showConfirmDialog(null, "" + tanyaempat , "konfirmasi jawaban anda", JOptionPane.YES_NO_CANCEL_OPTION);
        JOptionPane.showMessageDialog(null, "jawaban : " + tanyaempat);
       
        //Input
        //pertanyaan ke empat
        tanyalima = JOptionPane.showInputDialog("Apakah ada mempunyai rasa kurang puas dalam metode pembelajaran selama smester ini ?");
        
        //Outout
        
        input = JOptionPane.showConfirmDialog(null, "" + tanyalima , "konfirmasi jawaban anda", JOptionPane.YES_NO_CANCEL_OPTION);
        JOptionPane.showMessageDialog(null, "jawaban : " + tanyalima);
       
        //Input
        //pertanyaan ke lima
        tanyaenam = JOptionPane.showInputDialog("Apakah Fasilitas yang ada saat ini sangat membantu anda dalam belajar di kampus ini ?");
        
        //Output
        
        input = JOptionPane.showConfirmDialog(null, "" + tanyaenam , "konfirmasi jawaban anda", JOptionPane.YES_NO_CANCEL_OPTION);
        JOptionPane.showMessageDialog(null, "jawaban : " + tanyaenam);
        
        selesai = JOptionPane.showConfirmDialog(null, "anda telah menyelesaikan 0.5 petanyaan", "konfirmasi ", JOptionPane.DEFAULT_OPTION);
        
        JOptionPane.showInputDialog(null," Berikut adalah jawaban anda dari pertanyaan tadi "
                + "\n NAMA : " + nama
                + "\n Pertanyaan Pertama \n Apa motifasi anda untuk kuliah di UNIVERSITAS NAHDLATUL ULAMA BLITAR !"
                + "\n" +tanyadua        
                + "\n Pertanyaan Ke dua \n Apa Prodi atau Fakultas yang anda ambil ! "
                + "\n" +tanyatiga
                + "\n Pertanyaan Ke tiga \n Apa Mata Kuliah yang Anda favoritkan(suka) selama kuliah !"
                + "\n" +tanyaempat       
                + "\n Pertanyaan Ke empat \n Apakah ada mempunyai rasa kurang puas dalam metode pembelajaran selama smester ini ?"
                + "\n" +tanyalima       
                + "\n Pertanyaan Ke lima \n Apakah Fasilitas yang ada saat ini sangat membantu anda dalam belajar di kampus ini ?"
                + "\n" +tanyaenam ,JOptionPane.YES_OPTION);
    }
   
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO 330
 */
public class percabangan_switch_case {
    @SuppressWarnings("empty-statement")
    
    //TEMA                           //NB : setelah menjalankan memilih menu makanan
    //Memilih Menu                  jalankan lagi untuk memilih menu minuman
    public static void main(String[] args) {
        //variabel
        String MenuMakanan, MenuMinuman;
        int pilihmakanan, pilihminuman;
        //Input
        MenuMakanan=JOptionPane.showInputDialog(null,"              "
                + "WARUNG JANDA DESA\n  ~Menu Makanan~\n1.Rujak Manis"
                + "\n2.Tahu Lontong\n3. Tahu Bumbu\n4.gado-gado\n5.Pilih Minuman");
        pilihmakanan = Integer.parseInt(MenuMakanan);
        
        switch(pilihmakanan)
        {
        //Output   
            case 1:
                JOptionPane.showMessageDialog(null,"nasi Goreng Rp5.000.00");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"nasi kuning Rp3.000.00");
                break;
            case 3 :
                JOptionPane.showMessageDialog(null,"nasi Timbel Rp6.000.00");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"nasi Rames Rp4.000.00");
                break;
            case 5:
                //Input
                MenuMinuman=JOptionPane.showInputDialog(null,"              "
                        + "WARUNG JANDA DESA\n  ~Menu Minuman~\n1.ES Teh(manis)"
                        + "\n2.ES teh (tawar)\n3.ES jeruk\n4.ES dawet\n99.Keluar");
                pilihminuman = Integer.parseInt(MenuMinuman);
               
                switch(pilihminuman)
                {
               //Output     
                    case 1:
                        JOptionPane.showMessageDialog(null,"Es Teh(manis) Rp3.000.00");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"Es Teh (tawar) Rp2.000.00");
                        break;
                    case 3 :
                        JOptionPane.showMessageDialog(null,"Es Teh Jeruk Rp6.000.00");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null,"Es Dawe Rp4.000.00");
                        break;
                    case 99:
                        JOptionPane.showMessageDialog(null,"Keluar");
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null,"salah pencet");
                }
                
                while(true);
        }
    }

}   
    


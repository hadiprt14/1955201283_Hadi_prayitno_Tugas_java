/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author LENOVO 330
 */
public class perulangan_for {

    //TEMA
    //Olahraga
    public static void main(String[] args) {
        
       //Variabel
        int kepala, pundak, lutut, kaki;
       //Input
        for (kepala = 1; kepala <= 8; kepala++){
            for (pundak = 1; pundak <= 6; pundak++){
                for (lutut = 1; lutut <= 4; lutut++){
                    for (kaki = 1; kaki <= 2; kaki++){
        //Output      
                        System.out.println("Olahraga setiap Hari Minggu  "+" kepala "+ kepala +" pundak "+ pundak +" lutut "+ lutut+" kaki "+ kaki);
                    }
                }
            }
        }
        
    }
}   

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6;

/**
 *
 * @author GL62
 */
public class Finally {
    public static void main(String[] args){
        int hasil;
        try{
            
           hasil=239/0;
        } catch(ArithmeticException e){
            System.out.println("Keslahan Exception Tedaopat Nilai Tidak Boleh No karena Pembagian ");
            
        } finally{
            System.out.println("Kalimat Finally Diblok ");
            
             }
        System.out.println("Kalimat Ini Diluar Finally");
        
    }
}

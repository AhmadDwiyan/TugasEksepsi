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
import java.util.*;
public class Pratikum {
    public static void main(String[] args) {
    int jumlah;
    int hasil;
        try{
    Scanner in = new Scanner (System.in);
    System.out.print("Jumlah yang akan dimasukkan : ");
    jumlah = in.nextInt();
     System.out.println(" hasil " +jumlah);   
     
     
        }
        catch(Exception e) {
            System.out.println("Nilai yang dimasukkan salah " + "harusnya angka");
          
        }  try{
    hasil=937/0;  
     System.out.println("Hasilnya Adalah ?? ");
     
        } catch(Exception e){
            
           System.out.println("Hasil Eksepsi Dari Pembagian N0L ");
           
           System.out.println(" Nilai Tidak Boleh NOL ");
        }
    
}
}

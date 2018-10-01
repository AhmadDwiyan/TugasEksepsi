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

public class TugasInputan {
    
 public static void main(String[] args){
     Scanner input = new Scanner(System.in);
      int a,b,hasil;
       try{
           System.out.println("Masukan Angka");
           a= input.nextInt();
   System.out.println("Masukan Angka");
       
            b = input.nextInt();
            
            hasil=b+a;
             
       } catch(Exception e){
           System.out.println("Isiliah Dengan ANGKA !!!!");
       }
     
     
     
 }   
}

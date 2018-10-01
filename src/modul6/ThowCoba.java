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
public class ThowCoba {
 public static void main(String[] args){
     String input = "SALAH";
     try{
         if(input.equals("SALAH")){
             throw new RuntimeException("Thow Demo");
         }else {
             System.out.println(input);
         } 
         System.out.println("Setelah Throwing");
         }
     catch(RuntimeException e){
         System.out.println("Eksepsi Ditangkap");
         System.out.println(e);
     }
 }   
}

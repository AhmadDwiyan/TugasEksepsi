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
public class Modul6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try {  System.out.println(5/0);
      System.out.println("Keluaran Program");
    }
       catch(ArithmeticException anjay){
    System.out.println("Exception yang ditangkap  "+anjay);
}
    }
   
}

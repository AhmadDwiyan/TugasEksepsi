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
public class TugasRumah {
 public static void main(String[] args) {
        try {
            int a[]=new int [7];
            a[4]=30/0;
            System.out.println("Hasil Benar"+
                    "Hasil : 6");
        }
        catch(ArithmeticException e) {
            System.out.println("Peringatan !!! : "+e);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Peringatan !! : "+e);
        }
        catch(Exception e){
            System.out.println("Warning : Exception lain " + e);
        }
        System.out.println("Eksepsi Terakhir");
        }
    }   


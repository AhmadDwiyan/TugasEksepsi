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
public class TangkapIkan {
    public static void main(String[] args){
      try {
          int a= 3/0; // POTENSI ERROR 
          int num= Integer.parseInt(args[0]);
          System.out.println("Perintah Selanjutnya...........");
          
      }  
      catch(ArrayIndexOutOfBoundsException e){
       System.out.println("Kedalahan Terdapat Di"+ e);
      }
      catch(NullPointerException e){
            System.out.println("Kedalahan Terdapat Di"+ e);
      }
      catch(Exception e){
           System.out.println("Kedalahan Terdapat Di"+ e);
      }
    }
}

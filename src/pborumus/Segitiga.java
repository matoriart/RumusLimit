/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pborumus;

/**
 *
 * @author user
 */
public class Segitiga {
   int alas = 6;
   int tinggi = 19;
   int sisiB = 12;
   int sisiC = 10;
   int Luassgt;
   int Kelsgt;
   
   void Rumus1 () {
       Luassgt = alas*tinggi*1/2;
       System.out.println("Luas Segitiga : "+Luassgt);
       System.out.println("Rumus : 1/2*alas*tinggi");
   }
   void Rumus1b () {
       Kelsgt = alas + sisiB + sisiC;
       System.out.println("Keliling Segitiga : "+Kelsgt);
       System.out.println("Rumus : sisi a + sisi b + sisi c");
       
   }
    
}

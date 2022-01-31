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
public class JajarGenjang {
    int alas = 9;
    int tinggi = 10;
    int sisiB = 8;
    int LuasJG;
    int KelJG;
    
    void Rumus5 () {
        LuasJG = alas*tinggi;
        System.out.println("Luas Jajar Genjang : "+LuasJG);
        System.out.println("Rumus : a x t/alas x tinggi");
    }
    void Rumus5b () {
        KelJG = 2*(alas + sisiB);
        System.out.println("Keliling Jajar Genjang : "+KelJG);
        System.out.println("Rumus : 2 x (sisi a + sisi b)");
    }
    
}

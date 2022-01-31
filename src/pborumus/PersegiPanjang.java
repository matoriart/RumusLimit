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
public class PersegiPanjang {
    int panjang = 3;
    int lebar = 5;
    int LuasPP;
    int KelPP;
    
    void Rumus4 () {
        LuasPP = panjang*lebar;
        System.out.println("Luas Persegi Panjang : "+LuasPP);
        System.out.println("Rumus : p x l");
    }
    void Rumus4b () {
        KelPP = 2*(panjang+lebar);
        System.out.println("Keliling Persegi Panjang : "+KelPP);
        System.out.println("Rumus : 2 x (p + l)");
    }
    
}

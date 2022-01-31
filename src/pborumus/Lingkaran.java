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
public class Lingkaran {
    double d = 6;
    double π = 3.14;
    double LuasLKN;
    double KelLKN;
    
    
    void Rumus2 () {
        LuasLKN = π*(d/2);
        LuasLKN = π*LuasLKN;
        System.out.println("Luas Lingkaran : "+LuasLKN);
        System.out.println("Rumus : π x r x r (r di peroleh dari d = d/2");
    }
    void Rumus2b () {
        KelLKN = π*2*(d/2);
        System.out.println("Keliling Lingkaran : "+KelLKN);
        System.out.println("Rumus : π x 2 x r");
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pborumus;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class PBORumUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilih;
        System.out.println("Contoh RUMUS MATEMATIKA (Limited)");
        Scanner input = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("Pilih Rumus");
        System.out.println("1.Rumus Segitiga");
        System.out.println("2.Rumus Lingkaran");
        System.out.println("3.Rumus Persegi");
        System.out.println("4.Rumus Persegi Panjang");
        System.out.println("5.Rumus Jajar Genjang");
        System.out.println("=================");
        System.out.println("Yang Sabar Ya... Masih Belum Lengkap :)");
        System.out.print("Pilih :");
        pilih = input.nextInt();
       switch(pilih) {
           case 1:
               F1();
               
               break;
           case 2:
               F2();
               break;
           case 3:
               F3();
               
               break;
           case 4:
               F4();
               
               break;
           case 5:
               F5();
               
               break;
           case 6:
               System.out.println("Error....404");
               
               break;
               default:
       }
       
              
               
        
        
    }
    public static void F1() {
        Segitiga rumus = new Segitiga();
        rumus.Rumus1();
        rumus.Rumus1b();
        
        
        
    }
    public static void F2() {
        Lingkaran rumus = new Lingkaran();
        rumus.Rumus2();
        rumus.Rumus2b();
    }
    public static void F3() {
        Persegi rumus = new Persegi();
        rumus.Rumus3();
        rumus.Rumus3b();
        
    }
    public static void F4 () {
        PersegiPanjang rumus = new PersegiPanjang();
        rumus.Rumus4();
        rumus.Rumus4b();
    }
    public static void F5 () {
        JajarGenjang rumus = new JajarGenjang();
        rumus.Rumus5();
        rumus.Rumus5b();
    }
    
}

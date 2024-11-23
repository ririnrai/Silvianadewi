/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class matematikaCanggihBeraksi {
    public static void main(String[] args) {
        matematikacanggih mtk = new matematikacanggih();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai 1 : ");
        int nilai1 = input.nextInt();
        System.out.print("Masukkan Nilai 2 : ");
        int nilai2 = input.nextInt();
        
        System.out.println("Hasil Pertambahan : " + mtk.pertambahan(nilai1, nilai2));
        System.out.println("Hasil Perkalian : " + mtk.perkalian(nilai1, nilai2));
        System.out.println("Hasil Modulus : " + mtk.modulus(nilai1, nilai2));
    }
}

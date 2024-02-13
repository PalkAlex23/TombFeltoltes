/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feladatok;

import java.util.Random;
import java.util.Scanner;

public class KetjegyuParatlan {
    // psvm tab
    public static void main(String[] args) {
        final int DB = (int) (Math.random()*(25-15+1)+15);
        int[] parlan = new int[DB];
        
        /* feltöltés */
        for (int i = 0; i < DB; i++) {
            int szam = (int) (Math.random()*(99-10+1)+10); // szam++
            if (szam % 2 == 0) {
                szam++;
            }
            parlan[i] = szam;
        }
        
        /* legyen benne 1 páros: 
           LEHET benne 100-as érték is! */
        parlan[(int) (Math.random()*parlan.length)]++;
        
        /* kiírás */
        for (int i = 0; i < DB; i++) {
            System.out.print(parlan[i] + " ");
        }
        System.out.println("");
        
        /* KIVÁLASZTÁS tétel */
        
        int i = 0;
        while (!(parlan[i] % 2 == 0)) {
            i++;
        }
        System.out.println("páros elem: " + parlan[i]);
    }
}

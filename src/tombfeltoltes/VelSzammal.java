/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tombfeltoltes;

import java.util.Random;

public class VelSzammal {
    
    static Random rnd = new Random();
    
    public static void main(String[] args) {
        final int DB = 5;
        int[] korok = new int[DB];
        
        /* fetöltés */
        for (int i = 0; i < DB; i++) {
            // korok[i] = rnd.nextInt(); MIN_VALUE és MAX_VALUE között választ egy számot
            // korok[i] = rnd.nextInt(100);
            korok[i] = rnd.nextInt(21, 47);
        }
        
        /* kiírás */
        for (int i = 0; i < DB; i++) {
            System.out.println(korok[i]);
        }
    }
    
}

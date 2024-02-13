/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feladatok;

import java.util.Random;
import java.util.Scanner;

public class MaxHelyseg_02 {
    
    /* ELDÖNTÉS tétele */
    
    static Scanner sc = new Scanner(System.in, "latin2");
    static Random rnd = new Random();
    
    public static void main(String[] args) {
        
        System.out.print("hány helység lesz: ");
        final int DB = sc.nextInt();
        String[] helysegek = new String[DB];
        sc.nextLine();
        
        /* feltölt */
        
        for (int i = 0; i < DB; i++) {
            System.out.printf("helység neve (%d/%d): ", i+1, DB);
            helysegek[i] = sc.nextLine();
        }
        
        /* generál véletlen értékeket a létszámhoz */
        
        int[] letszamok = new int[DB];
        for (int i = 0; i < DB; i++) {
            letszamok[i] = rnd.nextInt(850, 1_238);
        }
        
        /* MAX. KIVÁLASZTÁS tétel */
        
        int max = letszamok[0];
        String hely = "";
        
        for (int i = 0; i < helysegek.length; i++) {
            if (max < letszamok[i]) {
                max = letszamok[i];
                hely = helysegek[i];
            }
        }

        int i = 0;
        while (i < DB && !(letszamok[i] == 1000)) {
            i++;
        }
        
        System.out.printf("Van-e pontosan 1000 fős helység: ");
        
        if (i < DB) {
            System.out.printf("van - %s", hely);
        } else {
            System.out.println("nincs");
        }
    
        /* kiír */
        System.out.printf("Legnagyobb helység: %s\nlétszáma: %d\n", hely, max);
        
        /* ELDÖNTÉS tétel*/
        
        System.out.printf("Minden létszam > 1000: ");
        
        i = 0;
        while (i < DB && letszamok[i] > 1000) {
            i++;
        }
        
        if (i >= DB) {
            System.out.printf("igen", hely);
        } else {
            System.out.println("nem");
        }
    }
}

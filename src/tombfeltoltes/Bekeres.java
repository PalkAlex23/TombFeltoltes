/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombfeltoltes;

import java.util.Scanner;

/**
 *
 * @author PalkovicsAlex(SZOFT_
 */
public class Bekeres {
    
//    static Scanner sc = new Scanner(System.in, "latin2"); ISO-8859-1
    static Scanner sc = new Scanner(System.in, "latin2"); // ISO-8859-2
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("név db: ");
        int DB = sc.nextInt();
        String[] nevek = new String[DB];
        sc.nextLine();
        
        /* feltöltés */
        for (int i = 0; i < DB; i++) {
            System.out.printf("név (%d/%d): ", i+1, DB);
            String nev = sc.nextLine();
            nevek[i] = nev;
        }
        /* kiírás */
        for(int i = 0; i < DB; i++) {
            System.out.println(nevek[i]);
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feladatok;

public class VeletlenSzoveg_01 {
    public static void main(String[] args) {
        String[] betuk = {"a", "b", "c", "d", "e"};
    
        System.out.print("3 betű (a..e)");
    
        for (int i = 0; i < 3; i++) {
            int index = (int) (Math.random() *  betuk.length);
            String betu = betuk[index];
            System.out.println(betu + "");
        }
        
        System.out.println("");
    }
}

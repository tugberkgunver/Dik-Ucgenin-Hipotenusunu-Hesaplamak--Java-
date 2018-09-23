/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipotenus;

import java.util.Scanner;

/**
 *
 * @author tugberkgunver
 */
public class Hipotenus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci kenar:");
        int a = scanner.nextInt();
        System.out.println("İkinci kenar:");
        int b = scanner.nextInt();

        double sonuc = Math.sqrt(a * a + b* b);
        
        System.out.println(sonuc);
        
    }
    
}

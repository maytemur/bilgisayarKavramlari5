/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bilgisayarkavramlari5;

/**
 *
 * @author maytemur 
 * Fibonacci serisi döngülerle çözüm
 */
public class BilgisayarKavramlari5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Fibonacci serisi : 
        //1 1 2 3 5 8 13 21
        //a b c
        //  a b c
        //    a b c      
        int a = 1;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < 10; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
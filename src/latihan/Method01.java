/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author ONE
 */
public class Method01 {
    public static int hitung(int a, int b)
    {
        int c = a + b;
        return c;
    }
    public static void main(String[] args)
    {
        int x;
        int bil1 = 29, bil2 = 061;
        
        x = hitung (bil1, bil2);
        
        System.out.println("Hasil : " +x);
    }
}


package if1;

/** Nama : Tazkiyah Ridha Walla 
 * Stambuk : 13020210201
 * Hari/ Tanggal : Jum'at, 17 Maret 2023 
 * Jam : 15:44 PM
 * @author hp
 * contoh pemakaian IF satu kasus */
/* membaca nilai integer, menuliskan nilainya jika positif */

import java.util.Scanner;

public class If1 {
    /**
     * @param args 
     */
    public static void main(String[] args) {
        // TODO Auto-generated methode stub
        /* Kmaus */
        Scanner masukan=new Scanner(System.in);
        int a;
        /*Program*/
        
        System.out.print ("Contoh IF satu kasus \n ");
        System.out.print ("Ketikkan suatu nilai integer : ");
        a = masukan.nextInt();
        if ( a>= 0 )
            System.out.print ("\nNilai a positif "+ a);
        
    }
    
}

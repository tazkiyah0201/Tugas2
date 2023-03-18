
package printwhile1;
/**
 * Nama : Tazkiyah Ridha Walla 
 * Stambuk : 13020210201
 * Hari/Tanggal : Jum'at, 17 Maret 2023
 * Jam : 18:56 PM
 */
import java.util.Scanner;
/* Baca N, */
/* Print i = 1 s/d N dengan while (ringkas) */
public class PrintWhile1 {
    /**
    * @param args
    */
    public static void main(String[] args) {
            // TODO Auto-generated method stub
            /* Kamus : */
            int N;
            int i = 1;
            Scanner masukan=new Scanner(System.in);
            /* Program */
            
            System.out.print ("Nilai N >0 = "); N = masukan.nextInt(); 
            System.out.print ("Print i dengan WHILE (ringkas): \n");
            while (i <= N){
                    System.out.println (i++);
            } /* (i > N)*/
            
    }
            
}
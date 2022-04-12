import java.util.Scanner;

public class nomor3 {
        public static void main(String[] args) {
         int n;
         int hasil = 0;
    
         Scanner x = new Scanner(System.in);
         System.out.print("Masukan banyak bilangan = ");
         n = x.nextInt();
    
         for (int i=1; i<=n; i++)
         hasil += i;
         System.out.println("Jumlah bilangan = " + hasil);
        }
    }
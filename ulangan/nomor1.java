import java.util.Scanner;

public class nomor1  {  
    public static void main(String[] args)   { 

    int a, b, terbesar;  

    Scanner scan = new Scanner(System.in); 

    System.out.print("masukkan angka pertama : ");  
    a = scan.nextInt();  
    System.out.print("masukkan angka kedua : ");  
    b = scan.nextInt();  
    terbesar = (a > b ? a : b);  
    System.out.println("angka terbesarnya adalah : "+terbesar);  
    }  
}  

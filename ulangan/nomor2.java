import java.util.Scanner;

public class nomor2 {
  public static void main(String[] args) {
    int a;
    Scanner scan = new Scanner(System.in);

    System.out.print("Masukkan angka : ");
    a = scan.nextInt();

    if (a % 2 == 0) {
      System.out.print("Bilangan " + a + " adalah bilangan genap");
    } else {
      System.out.print("Bilangan " + a + " adalah bilangan ganjil");
    }
  }
}
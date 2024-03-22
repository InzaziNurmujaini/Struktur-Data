package modul4;

// import java.math.*;
import java.lang.Math;
import java.util.*;
import java.util.stream.LongStream;

public class kalkulator {

  static kalkulator obj = new kalkulator();

  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    obj.user();
  }



  public void user() {
    System.out.println("=== Calculator ===");
    System.out.println(
      "1. Akar Kuadrat\n2. Pangkat\n3. Logaritma\n4. Faktorial\n5. Keluar"
    );
    System.out.print("Pilih operasi (1/2/3/4/5): ");
    int pilih = sc.nextInt();

    System.out.print("Masukkan Angka: ");
    int angka = sc.nextInt();
    System.out.println();
    obj.menu(angka, pilih);
  }

  public double menu(int x, int pilih) {
    if (pilih == 1) {
      System.out.println(
        "Hasil akar kuadrat dari " + x + " adalah " + obj.akarKuadrat(x)
      );
    
    } else if (pilih == 2) {
      System.out.print("Masukkan Pangkat: ");
      int y = sc.nextInt();
      System.out.println(x + " Pangkat " + y + " adalah " + obj.pangkat(x, y));
      
    } else if (pilih == 3) {
      System.out.println(
        "Logaritma natural dari " + x + " adalah " + obj.logaritma(x)
      );
    } else if (pilih == 4) {
      System.out.println("Faktorial dari " + x + " adalah " + obj.faktorial(x));
    }else{
      return 0;
    }
    obj.user();
    // return pilih
    return 0;
  }

  public double akarKuadrat(double x) {
    return Math.sqrt(x);
  }

  public double pangkat(double x, double n) {
    return Math.pow(x, n);
  }

  public double logaritma(double x) {
    return Math.log(x);
  }

  public double faktorial(int x) {
    return LongStream.rangeClosed(1, x).reduce(1, (long a, long b) -> a * b);
  }
}
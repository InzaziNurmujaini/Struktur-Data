package modul4;

import java.lang.String;
import java.util.Scanner;


public class textAnalyzer {

  static textAnalyzer obj = new textAnalyzer();

  static String x;

  public static void main(String[] args) {
    obj.user();
  }

  public void user() {
    Scanner sc = new Scanner(System.in);
      System.out.println("\n=== MENU TEKS ANALYZER ===");
      System.out.println(
        "1. Masukkan Teks\r\n" + //
        "2. Hitung Jumlah Karakter\r\n" + //
        "3. Hitung Jumlah Kata\r\n" + //
        "4. Cari Kata dalam Teks\r\n" + //
        "5. Keluar"
      );
      System.out.print("Pilihan Anda: ");
      int pilih = sc.nextInt();

      obj.menu(pilih);
    }
  

  public String menu(int pilih) {
    Scanner sc = new Scanner(System.in);
      String y;

      if (pilih == 1) {
        System.out.print("Masukkan teks: ");

        obj.inputTeks(x = sc.nextLine());
        System.out.println("Teks telah dimasukkan!");
      } else if (pilih == 2) {
        System.out.println("Jumlah karakter dalam teks: " + obj.countChar(x));
      } else if (pilih == 3) {
        System.out.println("Jumlah kata dalam teks: " + obj.countWord(x));
      } else if (pilih == 4) {
        System.out.print("Masukkan kata yang ingin dicari: ");
        y = sc.next();
        obj.countSearchWord(x, y);
        System.out.println(
          "Kata " + y + " ditemukan sebanyak: " + obj.countSearchWord(x, y) + " kali dalam teks");
      } else {
        return x;
      }
    
    obj.user();
    return x;
  }

  public String inputTeks(String x) {
    return x;
  }

  public int countChar(String x) {
    return x.length();
  }

  public int countWord(String x) {
    return x.split("\\s+").length;
  }

  public int countSearchWord(String x, String y) {
    int count = 0;

    for (String z : x.split("\\s+")) {
      if (z.equalsIgnoreCase(y)) {
        count++;
      }
    }
    return count;
  }
}

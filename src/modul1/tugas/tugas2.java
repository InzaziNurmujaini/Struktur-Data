package modul1.tugas;

import java.util.Scanner;

public class tugas2 {
  Scanner sc = new Scanner(System.in);

  int num[] = new int[5];
  float rataRata = 0;

  String input;
  String[] strNums;

  

  public void inputData() {
    System.out.print("Input maximal 5 angka dipisah dengan spasi : ");

    input = sc.nextLine();
    strNums = input.split(" ");
  }

  public void toNumber() {
    try {
      for (int i = 0; i < strNums.length; i++) {
        num[i] = Integer.parseInt(strNums[i]);
      }
    } catch (NumberFormatException e) {
      System.out.println("Input tidak berupa angka");
      System.exit(1);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Input melebihi " + num.length + " angka");
      System.exit(1);
    }
  }

  public void hitungRataRata() {
    for (int i = 0; i < num.length; i++) {
      rataRata += num[i];
    }

    rataRata /= strNums.length;
    System.out.println("Nilai rata-rata : " + rataRata);
  }

  public static void main(String[] args) {
    tugas2 obj = new tugas2();

    obj.inputData();
    obj.toNumber();
    obj.hitungRataRata();
  }
}


package modul4;

import java.util.Arrays;
import java.util.Scanner;

public class sortAPI {

  Scanner sc = new Scanner(System.in);
  static int[] data = { 38, -15, 72, 0, -42, 19, -63, 50, 27, -84, 61, 5 };
  static sortAPI obj = new sortAPI();

  public static void main(String[] args) {
    obj.sort();
  }

  public void sort() {
    Arrays.sort(data);
    System.out.println("Data yang sudah diurutkan: ");
    for (int num : data) {
      System.out.print(+num + " ");
    }
    obj.user();
  }

  public void user() {
    System.out.print("\nInput nilai untuk dicari indexnya: ");
    int x = sc.nextInt();
    System.out.println(
      "Nilai ditemukan di index: " + Arrays.binarySearch(data, x)
    );
    int min = 0, max = 0, eq = 0;
    for (int i = 0; i < data.length; i++) {
      if (data[i] < 0) {
        min++;
      } else if (data[i] > 0) {
        max++;
      } else if (data[i] == 0) {
        eq++;
      }
    }
    System.out.println("Jumlah elemen dengan nilai positif: " + max);
    System.out.println("Jumlah elemen dengan nilai negatif: " + min);
    System.out.println("Jumlah elemen dengan nilai nol: " + eq);
    // System.out.println("Nilai ditemukan di index " + x + " adalah: " + data[x]);
  }
}

package modul5;

import java.io.FileWriter;

public class create {

  public static void main(String[] args) {
    try {
      FileWriter fw = new FileWriter("data_mahasiswa.txt");
      fw.close();
      System.out.println("File berhasil dibuat");
    } catch (Exception e) {
      System.out.println("Exception Occurred");
    }
  }
}
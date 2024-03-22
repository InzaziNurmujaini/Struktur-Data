package modul5;

import java.io.*;
import java.util.Scanner;

public class dataMahasiswa {

  static dataMahasiswa obj = new dataMahasiswa();
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    obj.user();
  }

  public void user() {
    int x = 0;
    System.out.println("\nProgram input data mahasiswa");
    System.out.println("1. Read\n2. Insert\n3. Delete");
    System.out.print("Input pilihan: ");
    x = sc.nextInt();

    if (x == 1) {
      obj.read();
    } else if (x == 2) {
      obj.insert();
    } else if (x == 3) {
      obj.delete();
    } else {
      System.exit(1);
    }
  }

  public void read() {
    try {
      File file = new File("data_mahasiswa.txt");
      Scanner dr = new Scanner(file);
      while (dr.hasNextLine()) {
        String fileData = dr.nextLine();
        System.out.println(fileData);
      }
      dr.close();
      obj.user();
    } catch (Exception e) {
      System.out.println("Exception Occurred");
    }
  }

  public void insert() {
    try {
      FileWriter fw = new FileWriter("data_mahasiswa.txt", true);

      String nama, nim, sem;

      String text = "";

      while (!text.equals("n")) {
        System.out.print("Input Nama: ");
        nama = sc.next();
        fw.write("\n" + nama + ", ");

        System.out.print("Input NIM: ");
        nim = sc.next();
        fw.write(nim + ", ");

        System.out.print("Input Semester: ");
        sem = sc.next();
        fw.write(sem);

        System.out.print("Continue? y/n: ");
        text = sc.next();
      }
      fw.close();
      System.out.println("\nFile berhasil diupdate");
      obj.user();
    } catch (Exception e) {
      System.out.println("Exception Occured");
    }
  }

  public void delete() {
    try {
      File inputFile = new File("data_mahasiswa.txt");
      File tempFile = new File("temp.txt");

      BufferedReader br = new BufferedReader(new FileReader(inputFile));
      PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

  
      String text = "";
      int line = 0, deleteLine = 0;

      while (!text.equals("n")) {
        System.out.print("Pilih baris yang ingin di hapus:");
        deleteLine = sc.nextInt();
        String currentLine;
        while ((currentLine = br.readLine()) != null) {
          line++;
          if (deleteLine != line) {
            pw.println(currentLine);
          }
        }
        pw.close();
        br.close();
        inputFile.delete();
        tempFile.renameTo(inputFile);
        System.out.println("Data berhasil dihapus.");

        System.out.print("Continue? y/n: ");
        text = sc.next();
      }
      obj.user();
    } catch (Exception e) {
      System.out.println("Exception Occured");
    }
  }
  


}


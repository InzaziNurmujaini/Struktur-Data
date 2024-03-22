package modul4;

import java.util.*;


public class randomAPI {

  static randomAPI obj = new randomAPI();
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    obj.user();
  }

  public void user() {
    int pilih;
    System.out.println(
      "\nMenu:\r\n" + //
      "1. Random Angka\r\n" + //
      "2. Random String\r\n" + //
      "3. Keluar"
    );
    System.out.print("Pilih opsi (1/2/3): ");
    pilih = sc.nextInt();

    if (pilih == 1) {
      obj.ranAngka();
    } else if (pilih == 2) {
      obj.ranString();
    } else {
      System.out.println("Terima kasih, program berakhir.");
      System.exit(1);
    }
  }

  public void ranAngka() {
    System.out.print("Masukkan batas bawah angka acak:");
    int min = sc.nextInt();

    System.out.print("Masukkan batas atas angka acak: ");
    int max = sc.nextInt();

    Random random = new Random();
    int randomNumber = random.nextInt(max - min + 1) + min;

    System.out.println(randomNumber);
    obj.user();
  }

  public void ranString() {
    System.out.print("Masukkan panjang string acak: ");
    int  panjangStr = sc.nextInt();

    
    String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
         + "0123456789"
         + "abcdefghijklmnopqrstuvxyz"; 
 
  StringBuilder sb = new StringBuilder(panjangStr); 
 
  for (int i = 0; i < panjangStr; i++) { 
 
  
   int index 
    = (int)(AlphaNumericString.length() 
      * Math.random()); 
 
   // add Character one by one in end of sb 
   sb.append(AlphaNumericString 
      .charAt(index)); 
  } 
 
  

  System.out.println("String Acak: "+ sb.toString());
  obj.user();
} 
 

  }

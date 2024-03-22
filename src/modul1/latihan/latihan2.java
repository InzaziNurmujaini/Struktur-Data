package modul1.latihan;

import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan angka anda");
  
        try{
           int number = scanner.nextInt();
            System.out.print("masukkan angka: " + number);
          
        } catch(Exception e){
                System.out.println("Input bukan angka");
        }
    }
}

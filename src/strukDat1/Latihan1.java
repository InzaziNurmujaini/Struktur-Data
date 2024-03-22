package strukDat1;

import java.util.Scanner;

enum JenisBarang {
     Sandang,
     Pangan,
     Papan
    
}

class Barang <T, U, Jenis> {
    private T nama;
    private U harga;
    private Jenis jenis;
    

    public Barang (T nama, U harga){
        this.nama = nama;
        this.harga = harga;   
    }

    public T getNama(){
        return nama;}

    public U getHarga(){
        return harga;}
    }

public class Latihan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Masukkan nama : ");
        String namaBarang = scanner.nextLine();

        System.out.println("Masukkan Harga:");
        Integer hargaBarang = scanner.nextInt();


        System.out.println("Pilih Jenis Barang: ");
        for (JenisBarang jenis : JenisBarang.values()){
            System.out.println(jenis.ordinal() +  ". " + jenis);
        }

        System.out.println("Masukkan Pilihan: ");
        Integer pilihan = scanner.nextInt();

        JenisBarang jenisBarang = JenisBarang.values()[pilihan];

        Barang<String, Integer, JenisBarang> barang = new Barang<>(namaBarang, hargaBarang);


        System.out.println("\nInformasi Barang");
        System.out.println("Nama: " + barang.getNama());
        System.out.println("Harga: " + barang.getHarga());
        System.out.println("Jenis Barang: " + jenisBarang);

    }   
}
    


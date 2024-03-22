package StrukDat2;


import java.util.Scanner;

class Contact {
    private String name;
    private String phoneNumber;
    private Contact next;

    
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.next = null; 
    }

   
    public String getName() {
        return name;
    }

    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    
    public Contact getNext() {
        return next;
    }

    
    public void setNext(Contact next) {
        this.next = next;
    }

    
    @Override
    public String toString() {
        return "Nama: " + name + " - Nomor Telepon: " + phoneNumber;
    }
}

class ContactManager {
    private Contact head;

    
    public ContactManager() {
        this.head = null; 
    }

    
    public void addContact(Contact newContact) {
        if (head == null) {
            head = newContact;
        } else {
            Contact current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newContact); 
        }
        System.out.println("Kontak berhasil ditambahkan: " + newContact.getName());
    }

   
    public void displayContacts() {
        if (head == null) {
            System.out.println("Daftar kontak kosong.");
        } else {
            System.out.println("Daftar Kontak:");
            Contact current = head;
            while (current != null) {
                System.out.println(current);
                current = current.getNext();
            }
        }
    }


    public void searchContact(String name) {
        boolean contactFound = false;
        Contact current = head;
        while (current != null) {
            if (current.getName().equalsIgnoreCase(name)) {
                System.out.println("Kontak ditemukan - " + current);
                contactFound = true;
                break;
            }
            current = current.getNext();
        }
        if (!contactFound) {
            System.out.println("Kontak tidak ditemukan untuk nama: " + name);
        }
    }
}

public class LinkedListContactApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager contactManager = new ContactManager();

        System.out.println("Selamat datang di Aplikasi Manajemen Kontak menggunakan LinkedList!");

        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Kontak");
            System.out.println("2. Lihat Daftar Kontak");
            System.out.println("3. Cari Kontak");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1/2/3/4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama kontak: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan nomor telepon kontak: ");
                    String phoneNumber = scanner.nextLine();
                    Contact newContact = new Contact(name, phoneNumber);
                    contactManager.addContact(newContact);
                    break;

                case 2:
                    contactManager.displayContacts();
                    break;

                case 3:
                    System.out.print("Masukkan nama kontak yang dicari: ");
                    String searchName = scanner.nextLine();
                    contactManager.searchContact(searchName);
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan Aplikasi Manajemen Kontak. Sampai jumpa!");
                    exit = true;
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih antara 1-4.");
            }
        }
    }
}


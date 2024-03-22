package modul2;

public class BubbleSort {
    public static void main(String[] args) {
        int n = 50000;
        int[] arr = new int[n];

        // Isi array dengan elemen acak
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 1000000);
        }

        long startTime = System.currentTimeMillis(); // Catat waktu awal

        // Panggil bubbleSort untuk mengurutkan array
        bubbleSort(arr);

        long endTime = System.currentTimeMillis(); // Catat waktu akhir

        // Tampilkan array yang sudah diurutkan
         for (int i = 0; i < n; i++) {
             System.out.print(arr[i] + " ");
         }

        long executionTime = endTime - startTime;
        System.out.println("\nWaktu eksekusi: " + executionTime + " ms");
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Tukar elemen jika elemen saat ini lebih besar dari elemen berikutnya
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Jika dalam satu iterasi tidak ada pertukaran yang dilakukan, array sudah terurut.
            if (!swapped) {
                break;
            }
        }
    }
}



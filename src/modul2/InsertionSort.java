package modul2;

public class InsertionSort {
    public static void main(String[] args) {
        int n = 1000;
        int[] arr = new int[n];

        // Isi array dengan elemen acak
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 1000000);
        }

        long startTime = System.currentTimeMillis(); // Catat waktu awal

        // Panggil insertionSort untuk mengurutkan array
        insertionSort(arr);

        long endTime = System.currentTimeMillis(); // Catat waktu akhir

        // Tampilkan array yang sudah diurutkan
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        long executionTime = endTime - startTime;
        System.out.println("\nWaktu eksekusi: " + executionTime + " ms");
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
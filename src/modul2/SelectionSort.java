package modul2;

import java.util.Random;

public class SelectionSort{  
    int[] n;

    public void selectionSort(int[] arr){  
        int hitung = 0;
        int total = arr.length;

        for (int i = 0; i < total - 1; i++) {  
            int index = i;  
            System.out.println("Iterasi " + hitung++);
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index
                }  
            }  
            
            int temp = arr[index];   
            arr[index] = arr[i];  
            arr[i] = temp;  
        }  
    }  
       
    public static void main(String[] args){  
        int n = 1000;
        int[] arr = new int[n];
        Random acak = new Random();
        SelectionSort pindah = new SelectionSort();

        for(int i = 0 ; i < n ; i++){
            arr[i] = acak.nextInt(10);
        }
        System.out.println("Array awal : ");
        pindah.penampilan(arr);
        long startprogram = System.currentTimeMillis();
        pindah.selectionSort(arr);
        long endprogram = System.currentTimeMillis();
        System.out.println("");
        pindah.penampilan(arr);
        System.out.println("Waktu eksekusi : " + (endprogram -startprogram) + "ms");
    }
    
    public void penampilan(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

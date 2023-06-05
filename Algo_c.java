package Algorithms;

public class Algo_c {
    public static void main(String[] args) {
        int[] num = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        // Menampilkan angka-angka ganjil di dalam array
        for (int i : num) {
            if (i % 2 != 0 ) {
                System.out.print(i + " ");
            }
        }
    }
}
package Algorithms;

public class Algo_e {
    public static void main(String[] args) {
        int[] num = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        // Menampilkan angka-angka yang memiliki angka 2 di dalam array
        int x = 2;
        
        for (int i : num) {
            if (String.valueOf(i).contains(String.valueOf(x))) {
                System.out.print( i + " ");
            }
        }
    }
}
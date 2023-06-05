package Algorithms;

public class Algo_b {
    public static void main(String[] args) {
        int[] num = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        // Mencari sebuah angka di dalam array
        int x = 8;
        
        for (int i : num) {
            if (x == i) {
                System.out.println("Angka " + x + " ditemukan");
            } else {
                System.out.println("Angka " + x + " tidak ditemukan");
            }
        }
    }
}
package Algorithms;

public class Algo_n {
    public static void main(String[] args) {
        int[] num = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        // Menampilkan jumlah angka-angka di dalam array dengan seluruh angka-angka sebelumnya
        int sum = 0;
        for (int i : num) {
            sum += i;
            System.out.print(sum + " ");
        }
    }
}
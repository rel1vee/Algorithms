package Algorithms;

public class Algo_m {
    public static void main(String[] args) {
        int[] num = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        // Menghitung jumlah angka-angka selisih
        int sum = 0;
        for (int i = 0; i < num.length - 1; i++) {
            sum += num[i] - num[i + 1];
            System.out.print(sum + " ");
        }
    }
}
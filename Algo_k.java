package Algorithms;

public class Algo_k {
    public static void main(String[] args) {
        int[] num = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        // Menampilkan angka-angka yang setelahnya bernilai lebih besar
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] < num[i + 1]) {
                System.out.print(num[i] + " ");
            }
        }
    }
}
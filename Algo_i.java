package Algorithms;

public class Algo_i {
    public static void main(String[] args) {
        int[] num = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        // Menampilkan selisih angka-angka dengan angka setelahnya
        for (int i = 0; i < num.length - 1; i++) {
            int diff = num[i] - num[i + 1];
            System.out.print(diff + " ");
        }
    }
}
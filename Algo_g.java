package Algorithms;

public class Algo_g {
    public static void main(String[] args) {
        int[] num = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        // Menampilkan angka-angka kelipatan 5 yang sebelumnya juga angka kelipatan 5
        for (int i = 1; i < num.length; i++) {
            if (num[i] % 5 == 0 && num[i - 1] % 5 == 0) {
                System.out.print(num[i] + " ");
            }
        }
    }
}
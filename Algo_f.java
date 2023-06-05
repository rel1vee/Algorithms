package Algorithms;

public class Algo_f {
    public static void main(String[] args) {
        int[] num = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        // Menampilkan angka-angka ganjil yang diapit oleh angka genap
        for (int i = 1; i < num.length - 1; i++) {
            if (num[i] % 2 != 0 && num[i - 1] % 2 == 0 && num[i + 1] % 2 == 0) {
                System.out.print(num[i] + " ");
            }
        }
    }
}
package Algorithms;

public class Algo_j {
    public static void main(String[] args) {
        int[] num = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        // Menampilkan selisih angka-angka genap dengan angka setelahnya yang genap pula
        for (int i = 0; i < num.length - 1 ; i++) {
            if (num[i] % 2 == 0 && num[i + 1] % 2 == 0) {
                System.out.print(num[i] - num[i + 1] + " ");
            }
        }
    }
}
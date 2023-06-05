package Algorithms;

public class Algo_l {
    public static void main(String[] args) {
        int[] num = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        // Menampilkan jumlah angka dengan angka setelahnya yang hasil penjumlahannya genap
        for (int i = 0; i < num.length - 1; i++) {
            int sum = num[i] + num[i + 1];
            if (sum % 2 == 0) {
                System.out.print(sum + " ");
            }
        }
    }
}
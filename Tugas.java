import java.util.Scanner;

public class Tugas {

    // Fungsi rekursif
    public static int hitungTotalRekursif(int[] angkaList, int n) {
        if (n == 0) {
            return 0;
        }
        return angkaList[n - 1] + hitungTotalRekursif(angkaList, n - 1);
    }
    // Fungsi iteratif
    public static int hitungTotalIteratif(int[] angkaList) {
        int total = 0;
        for (int angka : angkaList) {
            total += angka;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung N: ");
        int n = sc.nextInt();

        int[] angkaList = new int[n];

        for (int i = n; i > 0; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angkaList[n - i] = sc.nextInt();
        }

        int totalRekursif = hitungTotalRekursif(angkaList, n);
        int totalIteratif = hitungTotalIteratif(angkaList);

        System.out.println("Total dari " + n + " angka yang dimasukkan adalah rekursif: " + totalRekursif);
        System.out.println("Total dari " + n + " angka yang dimasukkan adalah iteratif: " + totalIteratif);

    }
}

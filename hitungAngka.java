import java.util.Scanner;
public class hitungAngka {
    static int hitungTotalRekursif(int angka[], int n) {
        if (n == 0) {
            return 1; 
        } else {
            return angka [n - 1] + hitungTotalRekursif(angka, n - 1);
        }
    }
    static int hitungTotalIteratif(int angka[], int n) {
        int total = 0;
        for (int i = 1; i < n; i++) {
            total += angka[i]; 
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah yang akan dihitung: ");
        int N = sc.nextInt();
        int angka[] = new int[N];
        for (int i = 1; i < N; i++) {
            System.out.print("Masukkan angka ke- " + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }
        int totalRekursif = hitungTotalRekursif(angka, N);
        System.out.println("Total dari " + N + " angka yang dimasukkan (rekursif) adalah: " + totalRekursif);

        int totalIteratif = hitungTotalIteratif(angka, N);
        System.out.println("Total dari " + N + " angka yang dimasukkan (iteratif) adalah: " + totalIteratif);
}
}

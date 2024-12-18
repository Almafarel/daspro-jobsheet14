import java.util.Scanner;
public class hitungAngka {
    public static int totalRecursive(int[] numbers, int n) {
        if (n == 0) {
            return 0;
        }
        return numbers[n - 1] + totalRecursive(numbers, n - 1);
    }
    public static int totalIterative(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang akan dihitung: ");
        int N = scanner.nextInt();
        if (N <= 0) {
            System.out.println("Jumlah angka harus lebih besar dari 0 ");
            return;
        }
        int[] numbers = new int[N];

        for (int i = N; i > 0; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            numbers[i - 1] = scanner.nextInt();
        }
        int totalRekursif = totalRecursive(numbers, N);
        int totalIteratif = totalIterative(numbers);
        System.out.println("Total dari " + N + " angka yang dimasukkan adalah : " + totalRekursif);
}
}

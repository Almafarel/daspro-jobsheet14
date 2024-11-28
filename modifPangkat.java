import java.util.Scanner;
public class modifPangkat {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }

    static void cetakDeret(int x, int y) {
        for (int i = 0; i < y; i++) {
            System.out.print(x);
            if (i < y - 1) {
                System.out.print(" x ");
            }
        }
        System.out.print(" x 1 = ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat = 0;
        System.out.println("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.println("Pangkat: ");
        pangkat = sc.nextInt();
        cetakDeret(bilangan, pangkat);
        int hasil = hitungPangkat(bilangan, pangkat);
        System.out.println(hasil);
    }
}


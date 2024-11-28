import java.util.Scanner;
public class hitungLaba02 {
   static double hitungLaba(double saldo, int tahun) {
    if (tahun == 0) {
        return (saldo);
    } else {
        return (1.11 * hitungLaba(saldo, tahun - 1));
    }
   }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int saldoAwal, tahun = 0;
    System.out.println("Jumlah saldo awal: ");
    saldoAwal = sc.nextInt();
    System.out.println("Lamanya investasi (tahun): ");
    tahun = sc.nextInt();
    System.out.print("Jumlah saldo setelah " + tahun + " tahun: ");
    System.out.print(hitungLaba(saldoAwal, tahun));
   }
}

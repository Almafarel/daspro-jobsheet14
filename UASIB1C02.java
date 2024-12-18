// ALMAFAREL AKBAR REMIZARD, 244107060019, 02
import java.util.Scanner;
public class UASIB1C02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        String[] namaTim = new String[4]; 
        int[][] skor02 = new int[4][2];  
        int[] totalSkor02 = new int[4]; 

        while (true) { 
            System.out.println();
            System.out.println("=== MENU UTAMA ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = sc.nextInt();
            sc.nextLine(); 
            System.out.println();
            
            switch (pilihan) {
                case 1:
                    System.out.println("==== INPUT DATA SKOR TIM ====");
                    for (int i = 0; i < namaTim.length; i++) {
                        System.out.println();
                        System.out.print("Masukkan nama tim ke-" + (i + 1) + ": ");
                        namaTim[i] = sc.nextLine();
                        System.out.print("Masukkan skor " + namaTim[i] + " untuk Level 1: ");
                        skor02[i][0] = sc.nextInt();
                        System.out.print("Masukkan skor " + namaTim[i] + " untuk Level 2: ");
                        skor02[i][1] = sc.nextInt();
                        sc.nextLine(); 

                        totalSkor02[i] = skor02[i][0] + skor02[i][1];
                    }
                    System.out.println("\nData skor berhasil dimasukkan!");
                    break;

                case 2:
                    System.out.println("===== TABEL TURNAMEN =====");
                    System.out.printf("%-10s %-10s %-10s %-10s\n", "Nama Tim", "Level 1", "Level 2", "Total Skor");
                    System.out.println("===========================================");
                    for (int i = 0; i < namaTim.length; i++) {
                        System.out.printf("%-10s %-10d %-10d %-10d\n", namaTim[i], skor02[i][0], skor02[i][1], totalSkor02[i]);
                    }
                    System.out.println("===========================================");
                    break;

                case 3:
                    int maxSkor = totalSkor02[0];
                    String juaraTim = namaTim[0];
                    for (int i = 1; i < namaTim.length; i++) {
                        if (totalSkor02[i] > maxSkor) {
                            maxSkor = totalSkor02[i];
                            juaraTim = namaTim[i];
                        }
                    }
                    System.out.println("----- SELAMAT KEPADA TIM " + juaraTim + " TELAH MEMENANGKAN KOMPETISI !! -----");
                    break;

                case 4:
                    System.out.println("==== Terima kasih telah menggunakan program ini! ====");
                    return; 

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}






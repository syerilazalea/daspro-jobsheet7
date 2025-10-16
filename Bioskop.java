import java.util.InputMismatchException;
import java.util.Scanner;

public class Bioskop {
    public static void main(String[] args) {
        final long HARGA_TIKET = 50_000L;
        Scanner sc = new Scanner(System.in);

        long totalTiket = 0;
        long totalPendapatan = 0;

        System.out.println("Program Hitung Penjualan Tiket Bioskop");
        System.out.println("Masukkan jumlah tiket per pelanggan. Ketik 0 untuk selesai.");

        while (true) {
            System.out.print("Jumlah tiket pelanggan (0 untuk selesai): ");
            int jmlTiket;
            try {
                jmlTiket = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine(); 
                System.out.println("Input harus berupa bilangan bulat. Coba lagi.");
                continue;
            }

            if (jmlTiket == 0) {
                break;
            }
            if (jmlTiket < 0) {
                System.out.println("Jumlah tiket tidak boleh negatif. Input diabaikan.");
                continue;
            }

            double diskonRate = 0.0;
            if (jmlTiket > 10) {
                diskonRate = 0.15;
            } else if (jmlTiket > 4) {
                diskonRate = 0.10;
            }

            long gross = HARGA_TIKET * (long) jmlTiket;
            long diskon = Math.round(gross * diskonRate);
            long bayar = gross - diskon;

            totalTiket += jmlTiket;
            totalPendapatan += bayar;

            System.out.printf("Tiket: %d | Diskon: %.0f%% | Bayar: Rp %,d%n",
                    jmlTiket, diskonRate * 100, bayar);
        }

        System.out.println("----- Rekap Penjualan Hari Ini -----");
        System.out.printf("Total tiket terjual : %d%n", totalTiket);
        System.out.printf("Total pendapatan    : Rp %,d%n", totalPendapatan);

        sc.close();
    }
}
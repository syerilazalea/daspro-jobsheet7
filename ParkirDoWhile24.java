import java.util.Scanner;

public class ParkirDoWhile24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TARIF_MOBIL = 3000;
        final int TARIF_MOTOR = 2000;
        final int TARIF_TETAP = 12500;

        int totalKendaraan = 0;
        int totalPendapatan = 0;

        System.out.println("=== Program Hitung Pembayaran Parkir ===");
        System.out.println("Kode kendaraan: 1 = Mobil, 2 = Motor, 0 = Selesai");

        int kode, jam;

        do {
            System.out.print("\nMasukkan kode kendaraan (0 untuk selesai): ");
            kode = sc.nextInt();

            if (kode == 0) {
                break; // keluar dari perulangan
            }

            if (kode != 1 && kode != 2) {
                System.out.println("Kode kendaraan tidak valid! Gunakan 1 untuk mobil atau 2 untuk motor.");
                continue;
            }

            System.out.print("Lama parkir (jam): ");
            jam = sc.nextInt();

            if (jam <= 0) {
                System.out.println("Durasi tidak valid! Masukkan jam lebih dari 0.");
                continue;
            }

            int bayar;

            if (jam > 5) {
                bayar = TARIF_TETAP;
            } else {
                if (kode == 1) {
                    bayar = jam * TARIF_MOBIL;
                } else {
                    bayar = jam * TARIF_MOTOR;
                }
            }

            System.out.println("Biaya parkir: Rp " + bayar);

            totalKendaraan++;
            totalPendapatan += bayar;

        } while (true);

        System.out.println("\n=== Rekapitulasi Hari Ini ===");
        System.out.println("Total kendaraan  : " + totalKendaraan);
        System.out.println("Total pendapatan : Rp " + totalPendapatan);

        sc.close();
    }
}



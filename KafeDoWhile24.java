import java.util.Scanner;
public class KafeDoWhile24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jml;
        int i = 0;
        String menu;
        double total = 0;

        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        do {
            System.out.print("Masukkan nama pelanggan (atau ketik 'batal' untuk keluar): ");
            namaPelanggan = scanner.next();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
            System.out.println("Transaksi dibatalkan.");
            System.out.println("Semua transaksi selesai.");
            scanner.close();
            return;
            }

            System.out.print("Jumlah kopi: ");
            kopi = scanner.nextInt();
            System.out.print("Jumlah teh: ");
            teh = scanner.nextInt();
            System.out.print("Jumlah roti: ");
            roti = scanner.nextInt();

            double subtotal = kopi * hargaKopi + teh * hargaTeh + roti * hargaRoti;
            total += subtotal;

            System.out.println("Total untuk " + namaPelanggan + ": " + subtotal);
        } while (true);
    }
}

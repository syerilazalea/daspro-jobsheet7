import java.util.Scanner;

public class SiakadFor24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlah = 10;
        System.out.println("Masukkan nilai Kuis untuk " + jumlah + " mahasiswa:");
        double nilai;
        System.out.print("Masukkan nilai mahasiswa ke-1: ");
        nilai = scanner.nextDouble();
        double tertinggi = nilai;
        double terendah = nilai;
        int lulus = 0;     
        int tidakLulus = 0; 
        if (nilai >= 60) lulus++; else tidakLulus++;

        for (int i = 2; i <= jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = scanner.nextDouble();
            if (nilai > tertinggi) { tertinggi = nilai; }
            if (nilai < terendah)  { terendah = nilai; }
            if (nilai >= 60) lulus++; else tidakLulus++;
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa LULUS (nilai diatas 60): " + lulus);
        System.out.println("Jumlah mahasiswa TIDAK LULUS (nilai dibawah 60): " + tidakLulus);
        scanner.close();
    }
}
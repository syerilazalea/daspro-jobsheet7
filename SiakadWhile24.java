import java.util.Scanner;

public class SiakadWhile24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jml ;                 
        int nilai;
        int i = 0;         
        int tertinggi = -1;          
        int terendah = 101;          

        System.out.print("Jumlah mahasiswa: ");
        jml = scanner.nextInt();

        while (i < jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = scanner.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid! Masukkan nilai antara 0 hingga 100.");
                i++;
                continue;
            }

            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": Kategori: A");
                System.out.println("Bagus Pertahankan Nilainya");
            } else if (nilai > 73 &&  nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": Kategori: B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": Kategori: B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": Kategori: C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": Kategori: C");
            }
            else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": Kategori: D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": Kategori: E");
            }

            i++;
        }


        scanner.close();
    }
}

package P1jobsheet10.tugas;

import java.util.Scanner;

public class Main {
    public static void tampilkanMenu() {
        System.out.println("\n================ MENU ANTRIAN KRS ================");
        System.out.println("1. Tambah Mahasiswa ke Antrean (Enqueue)");
        System.out.println("2. Panggil Antrean untuk Proses KRS (Maks 2 Mhs)");
        System.out.println("3. Tampilkan Semua Antrean");
        System.out.println("4. Tampilkan 2 Antrean Terdepan");
        System.out.println("5. Tampilkan Antrean Paling Akhir");
        System.out.println("6. Cetak Statistik Antrean (Jumlah Antrean & KRS)");
        System.out.println("7. Kosongkan Antrean (Clear)");
        System.out.println("0. Keluar Program");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Jumlah kapasitas antrean maksimal diatur ke 10 sesuai instruksi soal
        AntrianKRS antrean = new AntrianKRS(10); 
        int pilihan;

        do {
            tampilkanMenu();
            pilihan = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer scanner

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrean.tambahAntrian(mhs);
                    break;
                case 2:
                    antrean.panggilKRS();
                    break;
                case 3:
                    antrean.tampilkanSemua();
                    break;
                case 4:
                    antrean.tampilkanDuaTerdepan();
                    break;
                case 5:
                    antrean.tampilkanPalingAkhir();
                    break;
                case 6:
                    System.out.println("\n=== STATISTIK LAYANAN KRS ===");
                    antrean.cetakJumlahAntrian();
                    antrean.cetakJumlahSudahKRS();
                    antrean.cetakBelumKRS();
                    break;
                case 7:
                    antrean.clear();
                    break;
                case 0:
                    System.out.println("Program selesai. Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}

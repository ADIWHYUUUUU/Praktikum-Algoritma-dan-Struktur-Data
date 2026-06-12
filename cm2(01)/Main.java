import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemAntrianResto resto = new SistemAntrianResto();
        Scanner in = new Scanner(System.in);

        
        resto.tambahAntrian("Ainra", "08224500000"); 
        resto.tambahAntrian("Danra", "08224511111"); 
        resto.tambahAntrian("Sanri", "08224522222"); 

        int pilihan;
        do {
            System.out.println("\n=====================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH"); 
            System.out.println("=====================================");
            System.out.println("1. Tambah Antrian"); 
            System.out.println("2. Cetak Antrian");  
            System.out.println("3. Hapus Antrian dan Pesan"); 
            System.out.println("4. Laporan Pesanan"); 
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : "); 
            pilihan = in.nextInt();
            in.nextLine(); // Pembersih buffer scanner

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli : "); 
                    String nama = in.nextLine();
                    System.out.print("No HP        : "); 
                    String hp = in.nextLine();
                    resto.tambahAntrian(nama, hp);
                    break;

                case 2:
                    resto.cetakAntrian();
                    break;

                case 3:
                    System.out.print("Kode Pesanan : "); 
                    int kode = in.nextInt();
                    in.nextLine(); 
                    System.out.print("Nama Pesanan : "); 
                    String menu = in.nextLine();
                    System.out.print("Harga        : "); 
                    int harga = in.nextInt();
                    resto.hapusAntrianDanPesan(kode, menu, harga);
                    break;

                case 4:
                    resto.laporanPesanan();
                    break;

                case 0:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        in.close();
    }
}




































































// 1. Modifikasi Sorting (Berdasarkan Harga atau Kode)
// Cari fungsi urutkanPesananSesuaiNama() dan ganti kondisi if di dalamnya.
// Pmbatalan antrean(hapus node di tengah /Akhir )
//ascending
// Ganti kondisi perbandingan String menjadi perbandingan angka harga
//if (current.harga > current.next.harga) {
    // ... kode penukaran data (temp) tetap sama ...
//}
//descending









//Fitur cari data
// Tambahkan fungsi ini di SistemAntrianResto.java:
// public void cariPembeli(String namaDicari) {
//     if (headPembeli == null) {
//         System.out.println("Antrian kosong. Tidak ada data yang bisa dicari.");
//         return;
//     }
    


//     Pembeli current = headPembeli;
//     boolean ditemukan = false;
    
//     while (current != null) {
//         if (current.namaPembeli.equalsIgnoreCase(namaDicari)) {
//             System.out.println("Data Ditemukan!");
//             System.out.println("No Antrian: " + current.noAntrian);
//             System.out.println("No HP      : " + current.noHp);
//             ditemukan = true;
//             break; // Keluar loop jika sudah ketemu
//         }
//         current = current.next;
//     }
    
//     if (!ditemukan) {
//         System.out.println("Pembeli dengan nama '" + namaDicari + "' tidak ditemukan di antrean.");
//     }
// }







// 3. Pembatalan Antrean (Hapus Node di Tengah/Akhir)
// Tambahkan fungsi ini di SistemAntrianResto.java:
// public int hitungSisaAntrian() {
//     int count = 0;
//     Pembeli current = headPembeli;
//     while (current != null) {
//         count++;
//         current = current.next;
//     }
//     return count;
// }



// Lalu pada Main.java, di dalam perulangan do-while sebelum mencetak menu utama, Anda bisa memanggilnya seperti ini:
// System.out.println("Sisa antrian belum diproses: " + resto.hitungSisaAntrian());






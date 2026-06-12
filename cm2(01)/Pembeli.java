
public class Pembeli {
    public int noAntrian;
    public String namaPembeli; 
    public String noHp;        
    public Pembeli next;       

       public Pembeli(int noAntrian, String namaPembeli, String noHp) { 
        this.noAntrian = noAntrian;
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
        this.next = null;
    }
}














































































// 1. Menampilkan Laporan Terbalik (Descending / Z-A)
// ganti operator perbandingan string di dalam fungsi urutkanPesananSesuaiNama() pada file SistemAntrianResto.java
// Ubah tanda '>' menjadi '<' untuk mengubah dari Ascending ke Descending
// if (current.namaPesanan.compareToIgnoreCase(current.next.namaPesanan) < 0) {
//     // ... proses penukaran data (temp) tetap sama ...
// }



// 2. Validasi Batas Maksimal Antrean (Queue Limit)
// Modifikasi fungsi tambahAntrian untuk mengecek jumlah antrean saat ini terlebih dahulu (memanfaatkan fungsi hitungSisaAntrian yang kita buat sebelumnya):
// public void tambahAntrian(String nama, String noHp) {
//     // Validasi tambahan: Batasi maksimal 5 antrean aktif
//     if (hitungSisaAntrian() >= 5) {
//         System.out.println("Maaf, antrean penuh! Ruang tunggu Royal Delish sudah maksimal.");
//         return; 
//     }

//     Pembeli baru = new Pembeli(counterAntrian++, nama, noHp);
//     if (headPembeli == null) {
//         headPembeli = baru;
//         tailPembeli = baru;
//     } else {
//         tailPembeli.next = baru;
//         tailPembeli = baru;
//     }
//     System.out.println("Antrian berhasil ditambahkan dengan nomor: " + baru.noAntrian);
// }


// 3. Fitur Bersihkan Semua Data (Clear All)
// Tambahkan fungsi ini di SistemAntrianResto.java:
// public void resetSemuaData() {
//     headPembeli = null;
//     tailPembeli = null;
//     headPesanan = null;
//     counterAntrian = 1; // Reset ulang nomor antrean ke 1
//     System.out.println("Semua data antrean dan pesanan restoran telah dibersihkan!");
// }



// 4. Modifikasi Input: Membaca Antrean Terdepan Tanpa Menghapusnya (Peek)
// Tambahkan fungsi ini di SistemAntrianResto.java:
// public void intipAntrianTerdepan() {
//     if (headPembeli == null) {
//         System.out.println("Tidak ada antrean saat ini.");
//         return;
//     }
//     System.out.println("=====================================");
//     System.out.println("ANTREAN BERIKUTNYA YANG AKAN DIPANGGIL:");
//     System.out.println("No Antrian : " + headPembeli.noAntrian);
//     System.out.println("Nama       : " + headPembeli.namaPembeli);
//     System.out.println("=====================================");
// }
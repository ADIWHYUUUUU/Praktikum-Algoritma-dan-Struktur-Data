public class SistemAntrianResto {
    private Pembeli headPembeli = null;
    private Pembeli tailPembeli = null;
    private Pesanan headPesanan = null;
    private int counterAntrian = 1;

   
    public void tambahAntrian(String nama, String noHp) {
        Pembeli baru = new Pembeli(counterAntrian++, nama, noHp);
        if (headPembeli == null) {
            headPembeli = baru;
            tailPembeli = baru;
        } else {
            tailPembeli.next = baru;
            tailPembeli = baru;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + baru.noAntrian); 
    }

    public void cetakAntrian() {
        if (headPembeli == null) {
            System.out.println("-------------------------------------");
            System.out.println("Daftar Antrian Pembeli KOSONG");
            System.out.println("-------------------------------------");
            return;
        }
        System.out.println("-------------------------------------");
        System.out.println("Daftar Antrian Pembeli"); 
        System.out.println("-------------------------------------");
        System.out.printf("%-12s %-12s %-15s\n", "No Antrian", "Nama", "No HP"); 
        
        Pembeli current = headPembeli;
        while (current != null) {
            System.out.printf("%-12d %-12s %-15s\n", current.noAntrian, current.namaPembeli, current.noHp);
            current = current.next;
        }
    }

   
    public void hapusAntrianDanPesan(int kode, String namaMenu, int harga) {
        if (headPembeli == null) {
            System.out.println("Tidak ada antrean yang bisa diproses.");
            return;
        }

       
        Pembeli dipanggil = headPembeli;
        headPembeli = headPembeli.next;
        if (headPembeli == null) {
            tailPembeli = null;
        }

        Pesanan pesananBaru = new Pesanan(kode, namaMenu, harga);
        if (headPesanan == null) {
            headPesanan = pesananBaru;
        } else {
            Pesanan curr = headPesanan;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = pesananBaru;
        }

        System.out.println(dipanggil.namaPembeli + " telah memesan " + namaMenu); 
        System.out.println("Maka antrian " + dipanggil.noAntrian + " berkurang."); 
    }

   
    public void laporanPesanan() {
        if (headPesanan == null) {
            System.out.println("-------------------------------------");
            System.out.println("Belum ada pesanan yang direkap.");
            System.out.println("-------------------------------------");
            return;
        }

        urutkanPesananSesuaiNama();

        System.out.println("-------------------------------------");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)"); 
        System.out.println("-------------------------------------");
        System.out.printf("%-15s %-15s %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga"); 

        Pesanan current = headPesanan;
        int totalPendapatan = 0; 
        while (current != null) {
            System.out.printf("%-15d %-15s %-10d\n", current.kodePesanan, current.namaPesanan, current.harga);
            totalPendapatan += current.harga;
            current = current.next;
        }
        System.out.println("-------------------------------------");
        System.out.println("Total Pendapatan Restoran: Rp " + totalPendapatan); 
        System.out.println("-------------------------------------");
    }

    
    private void urutkanPesananSesuaiNama() {
        if (headPesanan == null || headPesanan.next == null) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            Pesanan current = headPesanan;
            
            while (current.next != null) {
                
                if (current.namaPesanan.compareToIgnoreCase(current.next.namaPesanan) > 0) {
                 
                    int tempKode = current.kodePesanan;
                    String tempNama = current.namaPesanan;
                    int tempHarga = current.harga;

                    current.kodePesanan = current.next.kodePesanan;
                    current.namaPesanan = current.next.namaPesanan;
                    current.harga = current.next.harga;

                    current.next.kodePesanan = tempKode;
                    current.next.namaPesanan = tempNama;
                    current.next.harga = tempHarga;

                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
}
package Pjobsheet11;

public class SLLMain01 {
    public static void main(String[] args) {
        // Membuat objek Single Linked List
        SingleLinkedList01 sll = new SingleLinkedList01();

        // Membuat 4 objek mahasiswa berdasarkan data verifikasi jobsheet
        Mahasiswa01 mhs1 = new Mahasiswa01("21212203", "Dirga", "4O", 3.6);
        Mahasiswa01 mhs2 = new Mahasiswa01("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa01 mhs3 = new Mahasiswa01("22212202", "Cintia", "3C", 3.5);
        Mahasiswa01 mhs4 = new Mahasiswa01("23212201", "Bimon", "2B", 3.8);

       
        sll.print(); // Cetak awal saat list masih kosong

        sll.addFirst(mhs4); // Tambah Bimon di awal list
        sll.print();

        sll.addLast(mhs1); // Tambah Dirga di akhir list
        sll.print();

        sll.insertAfter("Dirga", mhs3); // Sisipkan Cintia setelah Dirga
        
        sll.insertAt(2, mhs2); // Sisipkan Alvaro pada indeks ke-2
        sll.print();

        // ==================== PERCOBAAN 2: AKSES & HAPUS DATA ====================
        System.out.println("data index 1: ");
        sll.getData(1); // Mengambil data pada indeks ke-1

        System.out.println("data mahasiswa an Bimon berada pada index: " + sll.indexOf("Bimon"));
        System.out.println();

        System.out.println("--- Proses Penghapusan Elemen ---");
        sll.removeFirst(); // Menghapus data pertama
        sll.removeLast();  // Menghapus data terakhir
        sll.print();

        sll.removeAt(0);   // Menghapus data pada indeks ke-0 setelah modifikasi
        sll.print();
    }
}
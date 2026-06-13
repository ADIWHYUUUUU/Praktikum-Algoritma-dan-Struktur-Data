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

        // 1. Cetak awal saat list masih kosong
        sll.print();

        // 2. Tambah mhs1 (Dirga) sebagai data pertama
        sll.addFirst(mhs1);
        sll.print();

        // 3. Tambah mhs2 (Alvaro) di akhir list
        sll.addLast(mhs2);
        sll.print();

        // 4. Sisipkan mhs3 (Cintia) setelah mhs bernama "Dirga"
        sll.insertAfter("Dirga", mhs3);
        
        // 5. Sisipkan mhs4 (Bimon) pada indeks ke-2
        sll.insertAt(2, mhs4);
        
        // Cetak hasil akhir penambahan data
        sll.print();
    }
}
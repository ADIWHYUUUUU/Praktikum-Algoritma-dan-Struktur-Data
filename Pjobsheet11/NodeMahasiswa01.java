package Pjobsheet11;

public class NodeMahasiswa01 {
    public Mahasiswa01 data;
    public NodeMahasiswa01 next; // Pastikan di sini tertulis NodeMahasiswa01 (pakai angka 01)

    // Konstruktor
    public NodeMahasiswa01(Mahasiswa01 data, NodeMahasiswa01 next) {
        this.data = data;
        this.next = next;
    }
}
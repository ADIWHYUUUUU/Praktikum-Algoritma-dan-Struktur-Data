package Pjobsheet11;

public class Mahasiswa01 {
    public String nim;
    public String nama; // Pastikan ini String
    public String kelas;
    public double ipk;

    public Mahasiswa01() {
    }

    public Mahasiswa01(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println(nama);
        System.out.println(nim);
        System.out.println(kelas);
        System.out.println(ipk);
    }
}
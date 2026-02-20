package jobsheet2;

class mahasiswamain01 {

    public static void main(String[] args) {
        mahasiswa01 mhs1 = new mahasiswa01();

mhs1.nama = "Adiatma Wahyudi";
mhs1.nim = "254107020212";
mhs1.kelas = "TI 1C";
mhs1.ipk = 3.55;

mhs1.tampilkanInformasi();
mhs1.ubahKelas("SI 2K");
mhs1.updateIpk(3.60);
mhs1.tampilkanInformasi();
    }
}
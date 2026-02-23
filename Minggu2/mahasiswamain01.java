package Minggu2;

public class mahasiswamain01 {
    public static void main(String[] args) {
        
    

mahasiswa01 mhs1 = new mahasiswa01();
mhs1.nama = "Beni Wahyudi";
mhs1.nim = "2541720171";
mhs1.kelas = "TI 1C";
mhs1.ipk = 4.10;

mhs1.tampilkanInformasi();
mhs1.ubahKelas("SI 2K");
mhs1.updateIpk(3.70);
mhs1.tampilkanInformasi();

mahasiswa01 mhs2=new mahasiswa01("Annisa Nabila","2141720160",3.25,"TI 2L");
mhs2.updateIpk(3.30);
mhs2.tampilkanInformasi();
    }
}

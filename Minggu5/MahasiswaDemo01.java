package Minggu5;

public class MahasiswaDemo01 {
    public static void main(String[] args) {
        MahasiswaBerprestasi01 list = new MahasiswaBerprestasi01(); 

        
        Mahasiswa01 m1 = new Mahasiswa01("123", "Zidan", "2A", 3.2);
        Mahasiswa01 m2 = new Mahasiswa01("124", "Ayu", "2A", 3.5);
        Mahasiswa01 m3 = new Mahasiswa01("125", "Sofi", "2A", 3.1);
        Mahasiswa01 m4 = new Mahasiswa01("126", "Sita", "2A", 3.9);
        Mahasiswa01 m5 = new Mahasiswa01("127", "Miki", "2A", 3.7);

        
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: "); 
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) - BUBBLE SORT: ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC): "); 
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC): "); 
        list.insertionSort();
        list.tampil();
    }
}

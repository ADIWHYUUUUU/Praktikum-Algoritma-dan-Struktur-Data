package Minggu3;

import java.util.Scanner;

public class MatakuliahDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Matakuliah01[] arrayOfMatakuliah = new Matakuliah01[3];

        for(int i = 0; i < arrayOfMatakuliah.length; i++){

            System.out.println("Masukkan data matakuliah ke-" + (i+1));

            System.out.print("Kode : ");
            String kode = sc.nextLine();

            System.out.print("Nama : ");
            String nama = sc.nextLine();

            System.out.print("SKS : ");
            int sks = sc.nextInt();

            System.out.print("Jumlah Jam : ");
            int jumlahJam = sc.nextInt();
            sc.nextLine();

            arrayOfMatakuliah[i] = new Matakuliah01(kode, nama, sks, jumlahJam);
        }

        System.out.println("\nData Matakuliah");

        for(Matakuliah01 mk : arrayOfMatakuliah){
            System.out.println("Kode        : " + mk.kode);
            System.out.println("Nama        : " + mk.nama);
            System.out.println("SKS         : " + mk.sks);
            System.out.println("Jumlah Jam  : " + mk.jumlahJam);
            System.out.println();
        }

    }
}
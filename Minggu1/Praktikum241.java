package Minggu1;
import java.util.Scanner;

public class Praktikum241 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = input.nextInt();
        input.nextLine();

        String[] namaMK = new String[jumlahMK];
        int[] sks = new int[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] nilaiSetara = new double[jumlahMK];

        double totalBobot = 0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("\nMata Kuliah ke-" + (i + 1));

            System.out.print("Nama MK      : ");
            namaMK[i] = input.nextLine();

            System.out.print("Jumlah SKS   : ");
            sks[i] = input.nextInt();

            System.out.print("Nilai Angka  : ");
            nilaiAngka[i] = input.nextDouble();
            input.nextLine();

            // Validasi nilai
            if (nilaiAngka[i] < 0 || nilaiAngka[i] > 100) {
                System.out.println("Nilai tidak valid!");
                return;
            }

            // Konversi nilai
            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0;
            }

            totalBobot += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }

        double ip = totalBobot / totalSKS;

        // Output
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("======================================================");
        System.out.printf("%-25s %-10s %-10s %-10s\n", 
                          "Mata Kuliah", "Nilai", "Huruf", "Bobot");

        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-25s %-10.2f %-10s %-10.2f\n",
                    namaMK[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
        }

        System.out.println("======================================================");
        System.out.printf("IP Semester: %.2f\n", ip);
    }
}

package Minggu1;
import java.util.Scanner;


public class Praktikum221 {



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

         System.out.println("Program Menghitung Nilai Akhir");
       System.out.println("==============================");

    
        System.out.print("Masukkan nilai Tugas:");
        double tugas=scanner.nextDouble();

        System.out.print("Masukkan nilai Kuis:");
        double kuis=scanner.nextDouble();
        


        System.out.print("Masukkan nilai UTS:");
        double uts=scanner.nextDouble();

        System.out.print("Masukkan nilai UAS:");
        double uas=scanner.nextDouble();

        double persentugas=tugas*0.20;

        double persenkuis=kuis*0.20;

        double persenuas=uas*0.30;

        double persenuts=uts*0.30;

        double nilaitotal=persentugas+persenkuis+persenuas+persenuts;

        if (tugas < 0 || tugas > 100 ||
    kuis < 0 || kuis > 100 ||
    uts < 0 || uts > 100 ||
    uas < 0 || uas > 100) {

    System.out.println("==============================");
       System.out.println("==============================");

    System.out.println("Nilai tidak valid");

    System.out.println("==============================");
       System.out.println("==============================");
    return; 
}



       


      
       System.out.println("==============================");
       System.out.println("==============================");
       
       System.out.println("nilai akhir:"+nilaitotal);

        String nilaiHuruf;

        if (nilaitotal >= 80) {
            nilaiHuruf = "A";
        } else if (nilaitotal >= 73) {
            nilaiHuruf = "B+";
        } else if (nilaitotal >= 65) {
            nilaiHuruf = "B";
        } else if (nilaitotal >= 60) {
            nilaiHuruf = "C+";
        } else if (nilaitotal >= 50) {
            nilaiHuruf = "C";
        } else if (nilaitotal >= 40) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }



       System.out.println("nilai huruf:"+nilaiHuruf);
        System.out.println("==============================");
       System.out.println("==============================");

       if (nilaiHuruf=="A" || nilaiHuruf=="B+" || nilaiHuruf== "B" || nilaiHuruf=="C+" || nilaiHuruf=="C"  ) {

        System.out.println("SELAMAT ANDA LULUS");
       } else if (nilaiHuruf=="D" || nilaiHuruf=="E") {
        System.out.println("MOHON MAAF ANDA TIDAK LULUS");
        
       }






    }
}
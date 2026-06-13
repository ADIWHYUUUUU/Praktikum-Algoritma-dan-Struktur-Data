package P1jobsheet10;

import java.util.Scanner; 

public class QueueMain {
    
    
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue (Tambah Antrian)");
        System.out.println("2. Dequeue (Kurangi/Layani Antrian)");
        System.out.println("3. Print (Cetak Semua Antrian)");
        System.out.println("4. Peek (Lihat Antrian Terdepan)");
        System.out.println("5. Clear (Kosongkan Antrian)");
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        
        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();
        
       
        Queue Q = new Queue(n);
        int pilih;

       
        do {
            menu(); 
            System.out.print("Pilihan Anda: ");
            pilih = sc.nextInt();
            
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    break;
                    
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                    }
                    break;
                    
                case 3:
                    Q.print(); 
                    break;
                    
                case 4:
                    Q.peek(); 
                    break;
                    
                case 5:
                    Q.clear(); 
                    break;
            }
            System.out.println(); 
            
        } while (pilih >= 1 && pilih <= 5); 
        
        System.out.println("Program selesai.");
        sc.close();
    }
}
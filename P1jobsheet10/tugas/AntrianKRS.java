package P1jobsheet10.tugas;

public class AntrianKRS {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int totalDiproses; 
    int targetDPA = 30; 
    public AntrianKRS(int n) {
        max = n;
        data = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
        totalDiproses = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrean berhasil dikosongkan.");
        } else {
            System.out.println("Antrean sudah kosong.");
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Gagal: Antrean sudah penuh (Maksimal 10)!");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk ke antrean.");
        }
    }

    public void panggilKRS() {
        if (isEmpty()) {
            System.out.println("Antrean kosong, tidak ada mahasiswa yang dipanggil.");
            return;
        }

        System.out.println("\n--- Memproses Persetujuan KRS ---");
        
        int jumlahDipanggil = Math.min(size, 2); 

        for (int k = 0; k < jumlahDipanggil; k++) {
            Mahasiswa mhs = data[front];
            System.out.print("Memproses mahasiswa ke-" + (k + 1) + ": ");
            mhs.tampilkanData();

            // Geser front sirkular
            if (size == 1) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
            size--;
            totalDiproses++;
        }
        System.out.println("Proses pemanggilan selesai.");
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrean kosong.");
            return;
        }
        System.out.println("\n=== Daftar Semua Mahasiswa dalam Antrean ===");
        int i = front;
        int nomor = 1;
        while (i != rear) {
            System.out.print(nomor + ". ");
            data[i].tampilkanData();
            i = (i + 1) % max;
            nomor++;
        }
        System.out.print(nomor + ". ");
        data[i].tampilkanData();
    }

    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrean kosong.");
            return;
        }
        System.out.println("\n=== 2 Antrean Terdepan ===");
        System.out.print("1. ");
        data[front].tampilkanData();
        
        if (size > 1) {
            int indeksKedua = (front + 1) % max;
            System.out.print("2. ");
            data[indeksKedua].tampilkanData();
        } else {
            System.out.println("Antrean kedua tidak tersedia (hanya ada 1 mahasiswa).");
        }
    }

    public void tampilkanPalingAkhir() {
        if (isEmpty()) {
            System.out.println("Antrean kosong.");
            return;
        }
        System.out.println("\n=== Antrean Paling Akhir ===");
        data[rear].tampilkanData();
    }

    public void cetakJumlahAntrian() {
        System.out.println("Jumlah mahasiswa aktif dalam antrean saat ini: " + size);
    }

    public void cetakJumlahSudahKRS() {
        System.out.println("Jumlah mahasiswa yang sudah melakukan proses KRS: " + totalDiproses);
    }

    public void cetakBelumKRS() {
        int belumKRS = targetDPA - totalDiproses;
        
        if (belumKRS < 0) belumKRS = 0; 
        System.out.println("Sisa mahasiswa yang belum melakukan proses KRS (Target " + targetDPA + "): " + belumKRS);
    }
}

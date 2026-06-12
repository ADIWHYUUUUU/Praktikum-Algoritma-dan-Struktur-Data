package jobsheet9;

public class StackTugasMahasiswa01 {
    Mahasiswa01[] stack;
    int size;
    int top;

    // Konstruktor StackTugasMahasiswa untuk Absen 01
    public StackTugasMahasiswa01(int size) {
        this.size = size;
        this.stack = new Mahasiswa01[size];
        this.top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasiswa01 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa01 pop() {
        if (!isEmpty()) {
            Mahasiswa01 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa01 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    // Memperbaiki perulangan agar mencetak dari tumpukan teratas (LIFO) sesuai output verifikasi
    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    // Method konversi desimal ke biner menggunakan bantuan StackKonversi01
    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi01 stackBiner = new StackKonversi01();
        int sisa = nilai;
        
        if (sisa == 0) return "0";
        
        while (sisa > 0) {
            int sisaBagi = sisa % 2;
            stackBiner.push(sisaBagi);
            sisa = sisa / 2;
        }
        
        String biner = "";
        while (!stackBiner.isEmpty()) {
            biner += stackBiner.pop();
        }
        return biner;
    }
}
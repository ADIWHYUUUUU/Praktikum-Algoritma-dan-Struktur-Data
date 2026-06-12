# Laporan Jawaban Pertanyaan - Jobsheet 9 (Stack)

**Nama:** Adiatma Wahyudi  
**Absen:** 01  
**Kelas:** TI 1C  

---

## 2.1.3 Pertanyaan Percobaan 1: Tumpukan Tugas Mahasiswa

### 1. Perbaikan Kode Program agar Sesuai Verifikasi

**Jawaban:**

Perbaikan dilakukan pada class `StackTugasMahasiswa01`, tepatnya di dalam method `print()`.

- **Masalah:** Kode awal bawaan jobsheet menggunakan perulangan urut maju (`0` ke `top`). Hal ini membuat daftar tugas dicetak dari tumpukan paling bawah (yang pertama kali dikumpulkan).
- **Perbaikan:** Karena Stack menganut prinsip **LIFO (Last In First Out)**, proses cetak harus dibalik dari indeks paling atas (`top`) mundur ke paling bawah (`0`) agar sesuai dengan tampilan verifikasi di modul.

```java
public void print() {
    // Diubah menjadi perulangan mundur dari top ke 0
    for (int i = top; i >= 0; i--) {
        System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
    }
    System.out.println("");
}
```

---

## 2.2.3 Pertanyaan Percobaan 2: Konversi Nilai Tugas ke Biner

### 1. Alur Kerja Method `konversiDesimalKeBiner`

**Jawaban:**

Method ini mengubah nilai desimal menjadi bentuk biner dengan memanfaatkan karakteristik Stack:

1. **Pembagian Berulang**  
   Nilai desimal (parameter `nilai`) dibagi 2 secara terus-menerus di dalam perulangan `while (nilai > 0)`.

2. **Push Sisa Bagi**  
   Di setiap siklus perulangan, sisa hasil bagi (`nilai % 2`) dimasukkan ke dalam `stackBiner` menggunakan operasi `push()`. Karena pembagian menghasilkan digit biner dari belakang (LSB ke MSB), stack akan menyimpan urutan tersebut secara terbalik.

3. **Pop untuk Menyusun String**  
   Setelah nilai desimal habis, perulangan `while (!stackBiner.isEmpty())` dijalankan. Data diambil satu per satu dari tumpukan teratas menggunakan `pop()`. Operasi ini otomatis membalikkan kembali urutan biner menjadi susunan yang benar (MSB ke LSB), lalu dikembalikan dalam bentuk `String`.

### 2. Mengubah Kondisi Perulangan Menjadi `while (kode != 0)`

*(Catatan: Variabel `kode` merujuk pada parameter input nilai desimal yang dihitung.)*

**Jawaban:**

**Hasilnya:** Output biner yang dihasilkan akan tetap sama dan berfungsi dengan normal untuk semua rentang nilai tugas (bilangan bulat positif dari rentang 0 sampai 100).

**Alasannya:** Nilai tugas mahasiswa selalu berupa bilangan bulat positif. Bilangan bulat positif yang dibagi 2 terus-menerus nilainya akan mengecil hingga habis menjadi 0. Titik berhentinya perulangan antara kondisi `nilai > 0` dan `nilai != 0` adalah persis sama, yaitu saat nilai variabel menyentuh angka tepat 0.


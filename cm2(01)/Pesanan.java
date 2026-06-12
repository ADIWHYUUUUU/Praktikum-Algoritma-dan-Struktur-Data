
public class Pesanan {
    public int kodePesanan; 
    public String namaPesanan; 
    public int harga;        
    public Pesanan next;    

    public Pesanan(int kodePesanan, String namaPesanan, int harga) { // [cite: 39, 161]
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
        this.next = null;
    }
}
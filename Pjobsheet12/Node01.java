package Pjobsheet12;

public class Node01 {
    public Mahasiswa01 data;
    public Node01 prev;
    public Node01 next;

    // Konstruktor sesuai diagram kelas
    public Node01(Mahasiswa01 data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

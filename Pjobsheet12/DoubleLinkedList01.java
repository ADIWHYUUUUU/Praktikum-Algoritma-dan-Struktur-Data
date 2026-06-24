package Pjobsheet12;

public class DoubleLinkedList01 {
    public Node01 head;
    public Node01 tail;

    public DoubleLinkedList01() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa01 data) {
        Node01 current = head;
        
        while (current != null && !current.data.nim.equals(keyNim)) { 
            current = current.next; 
        }

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan."); 
            return; 
        }

        Node01 newNode = new Node01(data); 

        if (current == tail) { 
            newNode.prev = current; 
            current.next = newNode; 
            tail = newNode; 
        } else { 
            newNode.prev = current; 
            newNode.next = current.next;
            current.next.prev = newNode; 
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) { 
            System.out.println("Linked List masih kosong."); 
            return; 
        }
        Node01 current = head; 
        while (current != null) { 
            current.data.tampil(); 
            System.out.println("--------------------");
            current = current.next; 
        }
    }

    public void removeFirst() {
        if (isEmpty()) { 
            System.out.println("Linked List kosong."); 
            return; 
        }
        
        Mahasiswa01 dihapus = head.data;

        if (head == tail) { 
            head = null; 
            tail = null; 
        } else { 
            head = head.next; 
            head.prev = null; 
        }
        System.out.println("Data berhasil dihapus: " + dihapus.nama);
    }

    public void removeLast() {
        if (isEmpty()) { 
            System.out.println("Linked List kosong."); 
            return; 
        }

        Mahasiswa01 dihapus = tail.data;

        if (head == tail) { 
            head = null; 
            tail = null; 
        } else { 
            tail = tail.prev; 
            tail.next = null; 
        }
        System.out.println("Data berhasil dihapus: " + dihapus.nama);
    }
}
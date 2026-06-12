package P1jobsheet10;

public class Queue {
    int[] data;   
    int front;   
    int rear;     
    int size;     
    int max;      


    public Queue(int n) {
        max = n;                 
        data = new int[max];     
        size = 0;                
        front = rear = -1;        
    }

   
    public boolean IsEmpty() {
        if (size == 0) {
            return true;  
        } else {
            return false; 
        }
    }

   
    public boolean IsFull() {
        if (size == max) {
            return true;  
        } else {
            return false; 
        }
    }


   
    public void peek() {
        if (!IsEmpty()) { 
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    
    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong"); 
        } else {
            int i = front;
            while (i != rear) { 
                System.out.print(data[i] + " "); 
                i = (i + 1) % max; 
            }
            
            System.out.println(data[i] + " "); 
            System.out.println("Jumlah elemen = " + size); 
        }
    }

    // Method untuk menghapus semua elemen pada queue
    public void clear() {
        if (!IsEmpty()) { 
            front = rear = -1; // Kembalikan posisi ke awal (kosong) [cite: 85]
            size = 0;          // Set jumlah elemen menjadi 0 [cite: 86]
            System.out.println("Queue berhasil dikosongkan"); 
        } else {
            System.out.println("Queue masih kosong"); 
        }
    }


}
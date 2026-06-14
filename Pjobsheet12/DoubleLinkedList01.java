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
}

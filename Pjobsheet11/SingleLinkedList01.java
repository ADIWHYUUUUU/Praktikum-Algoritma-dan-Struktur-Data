package Pjobsheet11;

public class SingleLinkedList01 {
    public NodeMahasiswa01 head;
    public NodeMahasiswa01 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa01 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                if (tmp.data != null) {
                    tmp.data.tampilInformasi();
                }
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(Mahasiswa01 input) {
        NodeMahasiswa01 ndInput = new NodeMahasiswa01(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa01 input) {
        NodeMahasiswa01 ndInput = new NodeMahasiswa01(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa01 input) {
        if (isEmpty()) return;
        
        NodeMahasiswa01 ndInput = new NodeMahasiswa01(input, null);
        NodeMahasiswa01 temp = head;
        do {
            if (temp.data != null && temp.data.nama != null && temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa01 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa01 temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp != null) {
                    temp = temp.next;
                }
            }
            if (temp != null) {
                NodeMahasiswa01 ndInput = new NodeMahasiswa01(input, temp.next);
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
            }
        }
    }

    public void getData(int index) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        NodeMahasiswa01 tmp = head;
        for (int i = 0; i < index; i++) {
            if (tmp != null) {
                tmp = tmp.next;
            }
        }
        if (tmp != null && tmp.data != null) {
            tmp.data.tampilInformasi();
        } else {
            System.out.println("Indeks tidak ditemukan");
        }
    }

    public int indexOf(String key) {
        NodeMahasiswa01 tmp = head;
        int index = 0;
        while (tmp != null) {
            if (tmp.data != null && tmp.data.nama != null && tmp.data.nama.equalsIgnoreCase(key)) {
                return index;
            }
            tmp = tmp.next;
            index++;
        }
        return -1;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeMahasiswa01 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
            return;
        }
        
        if (head.data != null && head.data.nama != null && head.data.nama.equalsIgnoreCase(key)) {
            removeFirst();
            return;
        }

        NodeMahasiswa01 temp = head;
        while (temp.next != null) {
            if (temp.next.data != null && temp.next.data.nama != null && temp.next.data.nama.equalsIgnoreCase(key)) {
                temp.next = temp.next.next;
                if (temp.next == null) {
                    tail = temp;
                }
                break;
            }
            temp = temp.next;
        }
    }

    public void removeAt(int index) {
        if (isEmpty()) return;
        
        if (index == 0) {
            removeFirst();
        } else {
            NodeMahasiswa01 temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp != null) {
                    temp = temp.next;
                }
            }
            if (temp != null && temp.next != null) {
                temp.next = temp.next.next;
                if (temp.next == null) {
                    tail = temp;
                }
            }
        }
    }
}
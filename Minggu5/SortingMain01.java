package Minggu5;

public class SortingMain01 {
    public static void main(String[] args) {

        int a[] = {20, 10, 2, 7, 12};

        Sorting01 dataurut1 = new Sorting01(a, a.length);

        System.out.println("Data awal:");
        dataurut1.tampil();

        
        dataurut1.bubbleSort();
        System.out.println("Setelah BUBBLE SORT:");
        dataurut1.tampil();

        
        int b[] = {20, 10, 2, 7, 12};
        Sorting01 dataurut2 = new Sorting01(b, b.length);

        
        dataurut2.selectionSort();
        System.out.println("Setelah SELECTION SORT:");
        dataurut2.tampil();

        
        int c[] = {20, 10, 2, 7, 12};
        Sorting01 dataurut3 = new Sorting01(c, c.length);

        
        dataurut3.insertionSort();
        System.out.println("Setelah INSERTION SORT:");
        dataurut3.tampil();
    }
}
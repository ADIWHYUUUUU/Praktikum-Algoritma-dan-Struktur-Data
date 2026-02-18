public class Praktikum251 {
     public static int hitungPendapatan(int aglonema, int keladi, int alocasia, int mawar) {
        int hargaAglonema = 75000;
        int hargaKeladi = 50000;
        int hargaAlocasia = 60000;
        int hargaMawar = 10000;

        return (aglonema * hargaAglonema) +
               (keladi * hargaKeladi) +
               (alocasia * hargaAlocasia) +
               (mawar * hargaMawar);
    }

    
    public static String cekStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    public static void main(String[] args) {

        
        int[][] stok = {
            {10, 5, 15, 7},  
            {6, 11, 9, 12}, 
            {2, 10, 10, 5},  
            {5, 7, 12, 9}     
        };

        System.out.println("=== Laporan Pendapatan RoyalGarden ===");

        for (int i = 0; i < stok.length; i++) {
            int pendapatan = hitungPendapatan(
                stok[i][0],
                stok[i][1],
                stok[i][2],
                stok[i][3]
            );

            String status = cekStatus(pendapatan);

            System.out.println("RoyalGarden " + (i + 1));
            System.out.println("Pendapatan : Rp " + pendapatan);
            System.out.println("Status     : " + status);
            System.out.println("-----------------------------");
        }
    }
}

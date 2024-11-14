public class DeretBerganti {
    public static void main(String[] args) {
        int n = 4; // Jumlah baris
        int angka = 1; // Angka mulai
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { // Baris genap
                for (int j = 0; j < 5; j++) {
                    System.out.print(angka + " ");
                    angka++;
                }
            } else { // Baris ganjil
                angka += 5; // Lewati 5 angka
                for (int j = 0; j < 5; j++) {
                    System.out.print((angka - j - 1) + " ");
                }
                angka += 5; // Siapkan angka untuk baris berikutnya
            }
            System.out.println();
        }
    }
}

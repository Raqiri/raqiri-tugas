public class DeretAngka {
    public static void main(String[] args) {
        int n = 4; // Jumlah baris
        int angka = 1; // Angka mulai
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(angka + " ");
                angka++;
            }
            System.out.println();
        }
    }
}

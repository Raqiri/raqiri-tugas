import java.util.Scanner;

public class HitungPecahanUang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah uang: ");
        int jumlahUang = scanner.nextInt();
        
        int[] pecahan = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 100};
        String[] namaPecahan = {"100 ribuan", "50 ribuan", "20 ribuan", "10 ribuan", "5 ribuan", "2 ribuan", "1 ribuan", "500", "100"};
        
        for (int i = 0; i < pecahan.length; i++) {
            int jumlahPecahan = jumlahUang / pecahan[i];
            if (jumlahPecahan > 0) {
                System.out.println(jumlahPecahan + " lembar " + namaPecahan[i]);
            }
            jumlahUang %= pecahan[i];
        }
        
        scanner.close();
    }
}

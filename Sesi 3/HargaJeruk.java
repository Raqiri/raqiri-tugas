import java.util.Scanner;

public class HargaJeruk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah jeruk yang ingin dibeli: ");
        int jumlahJeruk = scanner.nextInt();
        int harga;
        
        if (jumlahJeruk == 1) {
            harga = 3000;
        } else if (jumlahJeruk == 2) {
            harga = 5000;
        } else if (jumlahJeruk == 5) {
            harga = 10000;
        } else {
            harga = 3000 * jumlahJeruk; // Harga default
        }
        
        System.out.println("Total harga untuk " + jumlahJeruk + " jeruk = " + harga);
        
        scanner.close();
    }
}

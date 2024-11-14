import java.util.Scanner;

public class Endog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int hargaPerKg = 28000;
        System.out.print("Jumlah Telur (kg): ");
        double jumlahTelur = scanner.nextDouble();
        System.out.print("Total Bayar: ");
        double totalBayar = scanner.nextDouble();
        
        double totalHarga = hargaPerKg * jumlahTelur;
        double uangKembalian = totalBayar - totalHarga;
        
        System.out.printf("Total Harga: %.2f\n", totalHarga);
        System.out.printf("Uang Kembalian: %.2f\n", uangKembalian);
        
        scanner.close();
    }
}

    import java.util.Scanner;

    public class endog {
        public static void main(String[] args) {
            double hargaPerKilo = 28000;
            double jumlahTelur, totalHarga, uangDibayar, uangKembalian;
            Scanner input = new Scanner(System.in);
    
            System.out.print("Jumlah Telur (kg): ");
            jumlahTelur = input.nextDouble();
    
            System.out.print("Total Bayar: ");
            uangDibayar = input.nextDouble();
    
            totalHarga = jumlahTelur * hargaPerKilo;
    
            uangKembalian = uangDibayar - totalHarga;
    
            System.out.println("\nJumlah Telur(kg) : " + jumlahTelur + " kilo");
            System.out.println("Total Harga : " + totalHarga);
            System.out.println("Uang Kembalian : " + uangKembalian);
            input.close();
        }
    }
    

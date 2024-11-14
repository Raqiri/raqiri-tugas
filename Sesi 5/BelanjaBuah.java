import java.util.ArrayList;
import java.util.Scanner;

public class BelanjaBuah {
     static String[][] Buah = {
            {"apel", "35000"},
            {"jeruk", "50000"},
            {"mangga", "25000"},
            {"duku", "15000"},
            {"semangka", "20000"}
    };
    
    static class Belanja {
        String namaBuah;
        int jumlah;
        int harga;
        int subtotal;

        public Belanja(String namaBuah, int jumlah, int harga) {
            this.namaBuah = namaBuah;
            this.jumlah = jumlah;
            this.harga = harga;
            this.subtotal = jumlah * harga;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Belanja> daftarBelanja = new ArrayList<>();
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Beli Buah");
            System.out.println("2. Struk Belanja");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan: ");
            int pilihan = scanner.nextInt();
            
            if (pilihan == 1) {
                boolean beliLagi;
                do {
                    System.out.print("Pilih Buah (0-4): ");
                    int pilihanBuah = scanner.nextInt();
                    System.out.print("Masukkan jumlah: ");
                    int jumlah = scanner.nextInt();

                    String namaBuah = Buah[pilihanBuah][0];
                    int harga = Integer.parseInt(Buah[pilihanBuah][1]);
                    
                    // Tambah ke daftar belanja
                    daftarBelanja.add(new Belanja(namaBuah, jumlah, harga));
                    
                    System.out.print("Input lagi? (y/n): ");
                    beliLagi = scanner.next().equalsIgnoreCase("y");
                } while (beliLagi);
                
            } else if (pilihan == 2) {
                // Tampilkan struk belanja
                int total = 0;
                System.out.println("Daftar Belanja:");
                System.out.println("========================================");
                System.out.printf("%-4s %-10s %-6s %-10s %-10s%n", "No.", "Nama Buah", "Jumlah", "Harga", "Subtotal");
                
                for (int i = 0; i < daftarBelanja.size(); i++) {
                    Belanja item = daftarBelanja.get(i);
                    System.out.printf("%-4d %-10s %-6d %-10d %-10d%n", (i + 1), item.namaBuah, item.jumlah, item.harga, item.subtotal);
                    total += item.subtotal;
                }
                
                System.out.println("========================================");
                System.out.println("Total: " + total);
                
                int discount = (int) (total * 0.15);
                System.out.println("Discount(15%): " + discount);
                
                int totalBayar = total - discount;
                System.out.println("Total bayar: " + totalBayar);
                System.out.println();
                
            } else if (pilihan == 3) {
                System.out.println("Terima kasih telah berbelanja!");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
        
        scanner.close();
    }
}

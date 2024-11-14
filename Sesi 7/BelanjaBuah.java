import java.util.ArrayList;
import java.util.Scanner;

public class BelanjaBuah {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String[][] buah = {
                {"apel", "35000"},
                {"jeruk", "50000"},
                {"mangga", "25000"},
                {"duku", "15000"},
                {"semangka", "20000"}
            };

            ArrayList<String> daftarBuah = new ArrayList<>();
            ArrayList<Integer> daftarJumlah = new ArrayList<>();
            ArrayList<Integer> daftarSubtotal = new ArrayList<>();
            
            boolean lanjut = true;
            while (lanjut) {
                System.out.println("Menu:");
                System.out.println("1. Beli Buah");
                System.out.println("2. Struk Belanja");
                System.out.println("3. Keluar");
                System.out.print("Masukkan pilihan: ");
                int pilihan = input.nextInt();

                switch (pilihan) {
                    case 1:
                        System.out.println("Pilih Buah (0-4): ");
                        for (int i = 0; i < buah.length; i++) {
                            System.out.println(i + ". " + buah[i][0] + " - Rp" + buah[i][1]);
                        }

                        System.out.print("Masukkan pilihan: ");
                        int indexBuah = input.nextInt();
                        System.out.print("Masukkan jumlah: ");
                        int jumlah = input.nextInt();

                        daftarBuah.add(buah[indexBuah][0]);
                        daftarJumlah.add(jumlah);
                        int subtotal = Integer.parseInt(buah[indexBuah][1]) * jumlah;
                        daftarSubtotal.add(subtotal);

                        System.out.print("Input lagi? (y/n): ");
                        char lagi = input.next().charAt(0);
                        if (lagi == 'n' || lagi == 'N') {
                            lanjut = false;
                        }
                        break;

                    case 2:
                        System.out.println("Daftar Belanja:");
                        System.out.println("==========================================");
                        System.out.println("No.  Nama Buah   Jumlah  Harga   Subtotal");
                        System.out.println("==========================================");

                        int total = 0;
                        for (int i = 0; i < daftarBuah.size(); i++) {
                            String namaBuah = daftarBuah.get(i);
                            int jumlahBuah = daftarJumlah.get(i);
                            int hargaBuah = daftarSubtotal.get(i) / jumlahBuah;
                            int subtotalBuah = daftarSubtotal.get(i);
                            total += subtotalBuah;

                            System.out.printf("%-5d%-12s%-8d%-8d%-8d\n", (i + 1), namaBuah, jumlahBuah, hargaBuah, subtotalBuah);
                        }

                        int diskon = (int) (total * 0.15);
                        int totalBayar = total - diskon;

                        System.out.println("==========================================");
                        System.out.println("Total:         " + total);
                        System.out.println("Discount(15%): " + diskon);
                        System.out.println("Total bayar:   " + totalBayar);
                        System.out.println("==========================================");
                        break;

                    case 3:
                        System.out.println("Terima kasih telah berbelanja!");
                        lanjut = false;
                        break;

                    default:
                        System.out.println("Pilihan tidak valid!");
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}

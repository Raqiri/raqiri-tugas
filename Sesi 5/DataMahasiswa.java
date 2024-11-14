import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlahData = scanner.nextInt();
        scanner.nextLine(); // Mengkonsumsi newline

        String[] namaMahasiswa = new String[jumlahData];
        int[] nilaiMahasiswa = new int[jumlahData];
        double totalNilai = 0;

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("________________________________");
            System.out.println("Mahasiswa Ke : " + (i + 1));
            System.out.print("Nama: ");
            namaMahasiswa[i] = scanner.nextLine();
            System.out.print("Nilai: ");
            nilaiMahasiswa[i] = scanner.nextInt();
            scanner.nextLine(); // Mengkonsumsi newline
            totalNilai += nilaiMahasiswa[i];
        }

        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("================================");
        System.out.println("No\tNama\tNilai\tStatus");
        
        for (int i = 0; i < jumlahData; i++) {
            String status = (nilaiMahasiswa[i] >= 75) ? "Lulus" : "Tidak Lulus";
            System.out.println((i + 1) + "\t" + namaMahasiswa[i] + "\t" + nilaiMahasiswa[i] + "\t" + status);
        }

        System.out.println("================================");
        double rataRata = totalNilai / jumlahData;
        System.out.println("Jumlah: " + totalNilai);
        System.out.println("Nilai Rata-rata: " + rataRata);

        scanner.close();
    }
}
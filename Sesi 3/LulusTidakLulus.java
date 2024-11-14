import java.util.Scanner;

public class LulusTidakLulus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai: ");
        double nilai = scanner.nextDouble();
        
        if (nilai > 75) {
            System.out.println("Anda Lulus.");
        } else {
            System.out.println("Anda Tidak Lulus.");
        }
        
        scanner.close();
    }
}

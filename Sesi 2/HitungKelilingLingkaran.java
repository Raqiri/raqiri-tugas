import java.util.Scanner;

public class HitungKelilingLingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();
        double keliling = 2 * Math.PI * jariJari;
        
        System.out.printf("Keliling Lingkaran: %.2f\n", keliling);
        
        scanner.close();
    }
} 
    

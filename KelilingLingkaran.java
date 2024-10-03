
    import java.util.Scanner;

    public class KelilingLingkaran {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan jari-jari lingkaran: ");
            double jariJari = input.nextDouble();
            double keliling = 2 * Math.PI * jariJari;

            System.out.printf("Keliling lingkaran : %.2f ", keliling);
            input.close();
        }
    }

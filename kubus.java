import java.util.Scanner;

public class kubus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan sisi kubus: ");
        Double sisi = input.nextDouble();
        Double luas = sisi * sisi * sisi;

        System.out.println("Luas Kubus: " + luas);
        input.close();
    }
}
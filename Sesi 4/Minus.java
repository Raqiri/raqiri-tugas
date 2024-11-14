public class Minus {
    public static void main(String[] args) {
        int n = 5; // Jumlah baris
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("-1 ");
                }
            }
            System.out.println();
        }
    }
}

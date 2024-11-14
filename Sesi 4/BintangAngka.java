public class BintangAngka {
    public static void main(String[] args) {
        int n = 4; // Jumlah baris
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}

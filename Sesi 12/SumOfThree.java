public class SumOfThree {

    public static int sumOfThree(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        return sumOfThree(n - 1) + sumOfThree(n - 2) + sumOfThree(n - 3);


    }
    
    
    
    
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Deret penjumlahan 3 angka sebelumnya: ");
        for (int i = 0; i < n; i++){
            System.out.print(sumOfThree(i) + " ");
        }
    }




}
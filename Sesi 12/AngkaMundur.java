public class AngkaMundur {
   public static void printReverse(int n){
    if (n < 1){
        return;
    }
  System.out.println(n);
  printReverse(n - 1);
   }
   
    public static void main(String[] args) {
        int n = 10;
        System.out.println("cetak angka mundur dari" + n + "hingga 1: ");
        printReverse(n);
    }
}

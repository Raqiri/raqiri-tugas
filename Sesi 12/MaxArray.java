public class MaxArray {
    public static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int maxOfRest = findMax(arr, n - 1);
        return Math.max(arr[n - 1], maxOfRest);
    }

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 55, 58, 38};
        int max = findMax(arr, arr.length);
        System.out.println("Nilai maksimum dalam array adalah: " + max);
    }
}

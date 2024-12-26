public class BooleanArray {
    public static boolean contains(int[] arr, int n, int target) {
        if (n <= 0) {
            return false;
        }
        if (arr[n - 1] == target) {
            return true;
        }
        return contains(arr, n - 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        boolean result = contains(arr, arr.length, target);
        System.out.println("Apakah array mengandung " + target + "? " + result);
}
}
public class CheckSpecificValue {

    public static void main(String[] args) {
        int[] array = { 10, 47, 26, 28, 59, 26, 58, 28, 26, 74, 35, 72, 91 };
        System.out.println(check(array, 58));

    }

    public static boolean check(int[] array, int num) {
        for (int n : array) {
            if (num == n) {
                return true;
            }
        }
        return false;
    }
}

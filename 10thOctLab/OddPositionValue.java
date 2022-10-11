public class OddPositionValue {
    public static void main(String... args) {
        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("All odd position elements are: ");
        for (int i = 0; i < array.length; i = i + 2) {
            System.out.print(array[i]+" ");
        }
    }
}
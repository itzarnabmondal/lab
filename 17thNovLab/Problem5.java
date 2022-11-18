import java.util.LinkedList;
public class Problem5 {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(0);
        l.add(4);
        l.add(8);
        System.out.println("The LinkedList is: " + l);
        l.set(0, 2); // Replacing Index 0 with 2
        System.out.println("The LinkedList is: " + l);
    }
}
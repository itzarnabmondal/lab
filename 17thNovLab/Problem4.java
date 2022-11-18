import java.util.LinkedList;
public class Problem4 {
    public static void main(String args[])
    {
        LinkedList<String> list = new LinkedList<>(); // create a LinkedList

        list.addFirst("1");
        list.addFirst("2");
        list.addFirst("3");
        list.offerFirst("0"); // add elements at the front
        System.out.print(list);
    }
}

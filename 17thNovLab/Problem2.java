import java.util.ArrayList;
import java.util.List;

// Main class
public class Problem2 {
    public static void main(String[] args) {
        // Creating arraylist
        List <String> list = new ArrayList<>();
        // Vdding values
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        System.out.println("Original list: " + list); // Print the original list
        List <String> newList = list.subList(0, 3); // Extracting 3 elements
        System.out.println("List of first three elements: " + newList); // Printing extracted string
    }
}

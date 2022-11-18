import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        ArrayList<String> list1= new ArrayList<>(); // Creating Arraylist
        list1.add("Red");
        list1.add("Green");
        list1.add("Black");
        list1.add("White");
        list1.add("Pink");

        ArrayList<String> list2= new ArrayList<>();
        list2.add("Red");
        list2.add("Green");
        list2.add("Black");
        list2.add("Pink");

        ArrayList<String> list3 = new ArrayList<>();
        for (String e : list1) // Iterating
            list3.add(list2.contains(e) ? "Yes" : "No"); // Checking Condition
        System.out.println(list3); // Printing

    }
}

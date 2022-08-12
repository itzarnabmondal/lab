// Q3. Write a Java program to check whether Java is installed on your computer.

public class ProgramToCheck_Java_InstalledOrNot {
    public static void main(String[] args) {
        /* The getProperty method in Java is used to returns the 
        system property denoted by the specified key passed as its argument. */
        System.out.println("\nJava Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");
 }
}

class EvenThread extends Thread { // Creating Even Thread
    public void run() { // Overriding run method
        System.out.println(":: Even Thread Started ::\nAll even numbers are: ");
        for (int i = 1; i <= 100; i++) { // Calculating & printing even numbers up to 100
            if (i % 2 == 0)
                System.out.println(i + " ");
        }
    }
}

class OddThread extends Thread { // Creating Odd Thread
    public void run() {

        System.out.println(":: Odd thread started ::\nAll odd numbers are: ");
        for (int i = 1; i <= 100; i++) { // Calculating & printing odd numbers up to 100
            if (i % 2 != 0)
                System.out.println(i + " ");
        }
    }
}

public class Problem1 { // Main class
    public static void main(String[] args) throws Exception { // Main method
        EvenThread evenThread = new EvenThread(); // Creating object of both thread
        OddThread oddThread = new OddThread();
        evenThread.start(); // Starting even thread.
        evenThread.join(); // calling join method ( it's allows one thread to wait until another thread completes its execution )
        oddThread.start(); // Starting oddThread
    }
}
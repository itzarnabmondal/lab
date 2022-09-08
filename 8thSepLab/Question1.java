public class Question1 {
    Question1() {
        try {
            Class obj1 = Class.forName("Employee");
            Employee E1 = (Employee)obj1.newInstance();
            E1.name = "Arnab"; E1.id=100;

            Employee E2 = (Employee)obj1.newInstance();
            E2.name = "Arpan"; E2.id=101;

            Employee E3 = (Employee)obj1.newInstance();
            E3.name = "Sneha"; E3.id=102;

            Employee E4 = (Employee)obj1.newInstance();
            E4.name = "Bikram"; E4.id=103;

            Employee E5 = (Employee)obj1.newInstance();
            E5.name = "Ankita"; E5.id=104;
        }
        catch (Exception e) {
            System.out.println("Something Wrong Happened\n"+e);
        }
    }
    public static void main(String[] args) {
        try {
            Class obj2 = Class.forName("Question1");
            Question1 question1 = (Question1)obj2.newInstance();

        }
        catch (Exception e) {
            System.out.println("Something Wrong Happened\n"+e);
        }
    }
}
class Employee {
    String name;
    int id;
}
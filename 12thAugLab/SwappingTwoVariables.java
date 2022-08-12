public class SwappingTwoVariables {
    public static void main(String arg[]) {
        int x = 10;  
        int y = 20;
        System.out.println(":: Before swapping ::\n");    
        System.out.println("value of x:" + x);  
        System.out.println("value of y:" + y);  
        System.out.println("\n:: After swapping ::\n");  
        x = x + y;  
        y = x - y;  
        x = x - y;  
        System.out.println("value of x:" + x);  
        System.out.println("value of y:" + y);  
 }  
}
/* Q4. Write a Java program to compute the specified expressions and print the output.
Specified Expression: (25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5) */

public class ProgramToComputeAnExpression {
	public static void main(String[] args) {
		float a=25.5F, b=3.5F, d=40.5F, e=4.5F;
		float result = (a*b-b*b)/(d-e);
		System.out.println("Result is: "+result);
	}
}

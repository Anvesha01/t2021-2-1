import java.util.Scanner;

class Calculator{
	double a, b;
	String op;
	Calculator(double a, double b, String op){
		this.a = a;
		this.b= b;
		this.op = op;
		switch(op) {
			case "+":
				System.out.println(a+b);
				break;
			case "-":
				System.out.println(a-b);
				break;
			case "*":
				System.out.println(a*b);
				break;
			case "/":
				System.out.println(a/b);
				break;
		}
	}
}
public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		double a= sc.nextDouble();
		System.out.println("Enter second number:");
		double b= sc.nextDouble();
		System.out.println("Enter the operation: addition(+), subtraction(-), multiplication(*), division(/)");
		String op= sc.next();
		
		Calculator c = new Calculator(a, b, op);
	}

}

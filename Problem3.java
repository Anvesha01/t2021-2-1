import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

}

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		
		int sum = 1;
		int a = sc.nextInt();
		for(int i=0; i<a; i++) {
			if(i+1==a) {
				System.out.println(sum);
			}
			else {
			System.out.print(sum + ",");
			}
			sum = sum+2;
		}
	}

}

package Day1;

import java.util.Scanner;

public class IntegerNumber {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter initial number");
		int initial = scanner.nextInt();
		if (initial < 100) {
			sum = initial;
			do {
				System.out.println("enter other number");
				int other = scanner.nextInt();
				sum = sum + other;
				System.out.println(sum);		
			} while (sum < 100);
			System.out.println("sum is bigger than 100");
		}
		scanner.close();
	}
}
package Day1;

import java.util.Scanner;

public class FlourPack {
	public static boolean panCacks(int bigcount,int smallcount,int goal) {
		boolean flag=true;
		bigcount=5*bigcount;
		if(bigcount+smallcount>goal) {
			if(bigcount>goal) {
				flag=false;
			}
			else {
				flag=true;
				
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter goal");
		int goal=scanner.nextInt();
		System.out.println("enter bigcount");
		int bigcount=scanner.nextInt();
		System.out.println("enter small count");
		int small=scanner.nextInt();
		
		System.out.println(FlourPack.panCacks(bigcount, small, goal));
	}

}

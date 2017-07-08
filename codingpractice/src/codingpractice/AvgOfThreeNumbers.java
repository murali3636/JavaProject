package codingpractice;

import java.util.Scanner;

public class AvgOfThreeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,d,e;
		System.out.println("Enter the first number a:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		d=a+b+c;
		e=d/3;
		System.out.println("The avg is "+e);
		
		

	}

}

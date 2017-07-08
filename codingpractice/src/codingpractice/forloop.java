package codingpractice;

import java.util.Scanner;

public class forloop {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the table you need to get");
		a=sc.nextInt();
		System.out.println("Enter the limit");
		b=sc.nextInt();
		for(b=1;b<=10;b++)
		{
		//c=a*b;
			System.out.println(a+"*"+(b+0)+"="+a*(b+0));
		
			
		}
		
}
}

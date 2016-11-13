package hacker.rank;

import java.util.Scanner;

class Add{
	
	public void Addition(){
		
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the first number");
	int a = s.nextInt();
	System.out.println("Enter the second number");
	int b = s.nextInt();
	int c = +a+b;
	s.close();
	System.out.println("The sum is "+c);
	}
}
//helo world……..

public class Calc {
	public static void main(String[] args) {
		Add add = new Add();
		add.Addition();

		
	}
//That is my change remotely using terminal.
	
	//This change is done on github.com for pull operation demo.
}

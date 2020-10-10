package Assignment5_ForLoop;

import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Fibonacci series of n");
		System.out.println("---------------------------");
		
	    System.out.println("Enter number:");
	    int n = input.nextInt();
		int n1= 20, t1 = 0, t2 = 1;
        System.out.print("First " + n1 + " terms: ");

        for (int i = 1; i <= n1; ++i){
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
	}

}

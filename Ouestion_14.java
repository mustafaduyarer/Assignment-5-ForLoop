package Assignment5_ForLoop;

import java.util.Scanner;

public class Ouestion_14 {

	public static void main(String[] args) {
        
		Scanner scan = new Scanner (System.in);
		System.out.println("provide row");
		int row = scan.nextInt();
		for(int i=0; i<row ; i++) {
			System.out.print("#");
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			System.out.print("#");
			System.out.println();
		}
}
}
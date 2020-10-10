package Assignment5_ForLoop;

public class Ouestion_11 {

	public static void main(String[] args) {
		int rows=4;
		for (int i=1; i<=rows; i++)
		{System.out.print(" ");
			for (int y=rows-i+1; y>0; y--) {
			

				System.out.print(" "+y+" ");
				
			}
			System.out.println();
			
		}
	}

}

package lab2;
import java.util.Random;
import java.util.Scanner;
public class lab2_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final Random random = new Random();
		int rowCount = 3;
        int colCount = 3;
        int Low = 4; // мінімальне число в массиві
        int High = 45; // максимальне число в массиві

        int[][] ab = new int[rowCount] [colCount];

        for (int i = 0; i < rowCount; i++)
            for (int j = 0; j < colCount; j++)
            	ab[i][j] = Low + random.nextInt(High-Low+1);
        
        for (int i = 0; i < rowCount; i++)
        {
            for (int j = 0; j < colCount; j++)
            	System.out.print(ab[i][j]+ " ");
            	System.out.println();
            	}
	
       int S = 0;
        for (int i = 0; i < rowCount; i++) 
        {
        int min = ab[i][0];
        for (int j = 1; j < colCount; j++)
            	if (ab[i][j]<min) min = ab[i][j];
            S+= min;
	    }
	System.out.println("Sum = " + S);
	}
}

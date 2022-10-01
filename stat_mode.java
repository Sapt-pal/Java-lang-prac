/*Print the mode of a given integer array*/
import java.util.Scanner;
import java.util.Arrays;
public class stat_mode {
	public static void main() {
	        int max = 0; int maxint = 0;
		Scanner in = new Scanner(System.in);
		int[] Lst = new int[10];
		System.out.println("Enter array elements: ");
		for (int i = 0;i < 10;i++) {
		        System.out.print("Enter element " + i + ": ");
			Lst[i] = in.nextInt();
		}
		for (int j: Lst) {
			int c = 0;
			for (int k: Lst) {
				if (k == j) 
					c++;
			}
			if (c > max) {
				max = c;
				maxint = j;
			}
		}
		System.out.println("The mode of the array " +  Arrays.toString(Lst) + " is:"  + maxint + " ocurring " + max + " times.");
	}
}
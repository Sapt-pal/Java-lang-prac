/*
WAP to input 10 integers in an array and interchange consecutive elements in it.
SInput: [3,4,54,34,23,32]
SOutput: [4,3,34,54,32,23]
*/
import java.util.Scanner;
import java.util.Arrays;

public class adj_swp {
	public static void main() {
		Scanner in = new Scanner(System.in);
		int[] Lst = new int[5];
		System.out.println("Enter 15 array elements: ");
		for (int i = 0;i < 5;i++) {							//array elements input
			System.out.print("Enter element " + i + ": ");
			Lst[i] = in.nextInt();
		}
		for (int i = 0;i < 4;i++) {							//swap logic
			int t = Lst[i];
			System.out.print(i);
			Lst[i] = Lst[i+1];
			Lst[i+1] = t;
		}
		System.out.println("New array is: ");
		System.out.println(Arrays.asList(Lst));
		for (int i: Lst) {
			System.out.println(i);
		}
	}
}



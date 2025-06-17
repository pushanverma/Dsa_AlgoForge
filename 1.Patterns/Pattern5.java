
import java.util.*;

public class Pattern5 {
	public static void main(String[] args) {
		System.out.println("Hello World");

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int tnol = n * 2 + 1;

		int cnol = 1;

		int stars = 1;

		int space = n;

		int mid = (tnol + 1) / 2;

		System.out.println(mid + "...mid");

		while (cnol <= tnol) {

			// print spaces

			for (int i = 1; i <= space; i++) {
				System.out.print("\t");
			}

			// print stars

			for (int i = 1; i <= stars; i++) {
				System.out.print("*\t");
			}

			// prepare for the next line

			if (cnol < mid) {
				space--;
				stars += 2;
			} else {
				space++;
				stars -= 2;
			}

			cnol++;
			System.out.println();
		}

	}
}
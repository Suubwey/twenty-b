package Assignments;

import java.util.Arrays;

public class Lesson35TwoDArrays {
	public static void main(String[] args) {
		
		// QUESTION 1
		
		int a[][] = {
			{5, -16, 9, 21},
			{22, 19, -101, 36},
			{18, 17, 64, -2}
		};

		// QUESTION 2

		System.out.println(a[1][2]);

		// QUESTION 3 -> The correct answer is D

		// QUESTION 4

		System.out.println(a.length);

		// QUESTION 5

		System.out.println(a[2].length);

		// QUESTION 6
		
		System.out.println(a[1][3]); // Should print 36 (2nd row 4th column)

		// QUESTION 7 -> This code should print out the 2D array in a grid-like fashion.
		for (int row = 0; row < a.length; row++)
		{
			for (int col = 0; col < a[row].length; col++) {
				System.out.print(a[row][col] + "\t");
			}
			System.out.println(" ");
		}

		/* Output for Question 7:
		5       -16     9       21
		22      19      -101    36
		18      17      64      -2
		*/

		// QUESTION 8:
		Arrays.sort(a[0]);
		System.out.println(Arrays.binarySearch(a[0], 5)); // Should print 1
		/* What the search does in this case is it searches
		for the value of 5 in the first row of the a 2d Array.
		It is first sorted as you cannot perform a binary search
		on an unsorted list. The binary search returns the position
		index of 5 in the sorted list, which is the second position
		in the array since -16 is smaller */

		// QUESTION 9:
		Arrays.sort(a[0]);
		System.out.println(Arrays.binarySearch(a[0], 0)); // Should print -2
		/* In this case, if the number is not found then it will
		print a negative number, the number that it prints is determined
		by the formula -(index of where it would go)-1 */

		// QUESTION 10:
		/* For each of the positions in the 2d array, it will calculate the product of the row and column index of those positions. I added the print statements to show what the array looks like after */
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				a[row][col] = row * col;
				System.out.print(a[row][col] + "\t");
			}
			System.out.println("");
		}
	}
}

import java.util.Scanner;

public class Checkerboard {
	
	public static Scanner input = new Scanner(System.in);

	public static void chooseMove(int[][] board) {
		System.out.println("What coordinates would you like to move your first piece to?");
		System.out.print("Horizontal Coordinate: ");
		int coordX = input.nextInt();
		System.out.print("Vertical Coordinate: ");
		int coordY = input.nextInt();
		if (coordX > board[0].length || coordY > board.length || coordX < 1 || coordY < 1) {
			System.out.println("You can't move there");
		}
		else {
			System.out.printf("Move chosen: (%d, %d)", coordX, coordY);
		}
	}

	public static void printBoard(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			System.out.print((8-i) + " ");
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.print("  ");
		for (int i = 0; i < board.length; i++) {
			System.out.print((i+1) + " ");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		// CREATING THE BOARD
		
		int[][] board = new int[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j += 2) {
				if (i % 2 == 0) {
					board[i][j] = 1;
				} else {
					board[i][j+1] = 1;
				}
			}
		}
		printBoard(board);

		// POPULATING THE BOARD

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 8; j += 2) {
				if (i % 2 == 0) {
					board[i][j] = 2;
				} else {
					board[i][j+1] = 2;
				}
			}
		}
		for (int i = 7; i > 4; i--) {
			for (int j = 0; j < 8; j += 2) {
				if (i % 2 == 0) {
					board[i][j] = 3;
				} else {
					board[i][j+1] = 3;
				}
			}
		}
		printBoard(board);
		chooseMove(board);		
	}
}

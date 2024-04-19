package myPackage;
import java.util.Scanner;

public class TicTacToe {
	public static char[][] gameBoard = new char[3][3];
	public static char turn = 'O';
	
	public static void display() {
		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard[i].length; j++){
				System.out.print(gameBoard[i][j] + " ");
				
			}
			System.out.println("");
		}
	}
	public static boolean isWinner() {
		for (int i = 0; i < 3; i++) {
			if (gameBoard[i][0] == '\0') {
				continue;
			}
			char winner = gameBoard[i][0];
			if (winner == gameBoard[i][1] && winner == gameBoard[i][2]) {
				System.out.println("The winner is " + winner);
				return true;
			} 
		}
		for (int i = 0; i < 3; i++) {
			if (gameBoard[0][i] == '\0') {
				continue;
			}
			char winner = gameBoard[0][i];
			if (winner == gameBoard[1][i] && winner == gameBoard[2][i]) {
				System.out.println("The winner is " + winner);
				return true;
			}
		}
		for (int i = 0; i < 3; i+=2) {
			if (gameBoard[i][0] == '\0') {
				continue;
			}
			char winner = gameBoard[i][0];
			if (winner == gameBoard[1][1] && winner == gameBoard[2-i][2]) {
				System.out.println("The winner is " + winner);
				return true;
			}
		}
		
		return false;
	}
	
	public static void reset() {
		for (int i = 0; i < gameBoard.length; i++) {
			for(int j = 0 ; j < gameBoard[i].length; j++) {
				gameBoard[i][j] = '\0';
			}
		}
		turn = 'O';
	}
	public static void add() {
		/*    1   2   3
		  1     |   |
		    -------------
		  2     |   |
		    -------------
		  3     |   |
		                  
		                 */
		int column, row;
		while(true) {
			Scanner key = new Scanner(System.in);
			System.out.println("Enter position you want");
			System.out.println("If you add in column 1, row 2: 1 2");
			column = key.nextInt();
			row = key.nextInt();
			
			if (gameBoard[column-1][row-1] == '\0') {
				gameBoard[column-1][row-1] = turn;
				if (turn == 'O') {
					turn = 'X';
				} else if(turn == 'X') {
					turn = 'O';
				}
				break;
			} else {
				System.out.println("error");
			}
		
		
		}
	}
	public static void start() {
		reset();
		for (int i = 0; i < 9; i++) {
			System.out.println("This turn: " + turn);
			display();
			add();
			if (isWinner()) {
				display();
				break;
			}
			if (i == 8) {
				System.out.println("No winner");
			}
		}
		reset();
		
		
	}
	public static void main(String args[]) {
		
		Scanner keyboard = new Scanner(System.in);
		int status;
		do {
			
			System.out.println("1. start");
			System.out.println("2. exit");
			status = keyboard.nextInt();
			if (status == 1) {
				start();
			}
		} while(status != 2);
		
		keyboard.close();
		
	}
	
	
}

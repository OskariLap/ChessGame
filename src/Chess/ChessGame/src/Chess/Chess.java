package Chess;

import java.util.HashMap;
import java.util.Scanner;

public class Chess {

	public static void main(String[] args) {
		Board.createBoard(hmap);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give move");
		String move =scanner.nextLine(); 
		Startmove(move);
	}
	
		
		HashMap<int[], Piece> hmap = new HashMap<int[], Piece>();
		
		
		
		
		public int[] startmove(String move){
				
				int startX = (move.toUpperCase().charAt(0)) - 64;
				int startY = (Character.getNumericValue(move.charAt(1))); 
				int[] start = new int[] {startX, startY};
				return start;
		}
		public int[] finishmove(String move){
				
			int finishX = (move.toUpperCase().charAt(2));
				int finishY = (Character.getNumericValue(move.charAt(1))); 
				int[] finish = new int[] {finishX, finishY};
				return finish;
			  }
	/*
		 * After setting the board and creating all the pieces, the idea is to create a turn-based loop.
		 * 
		 * 1: read input from player
		 * 2: turn that input into two int[] parameters
		 * 3: check if there's a piece in the start square
		 * 4: use checkMove()-methods to see if the piece is able to move between the two given parameters
		 * 5: see if the opponent is able to Check the current player's king after the move
		 * 			-go through all pieces in oppositeColorPieces<Piece> and test their checkMove()-methods 
		 * 					in relation to the current player's King
		 * 6: if not, the move is made, the board state is updated and the player color is swapped.
		 * 
		 */
		
		//ASCII:  A == 65;  H == 72
		//changes args[]-letters into number values for board coordinates
		
		
		//Example input b3b4 moves from b3 to b4
		
		
	
		
	
		if(hmap.get(start) == null); //virhe

		hmap.get(start).checkMove();
		
		
	}

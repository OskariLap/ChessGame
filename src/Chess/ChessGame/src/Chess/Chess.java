package Chess;
import java.util.HashMap;
import java.util.Scanner;

public class Chess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		HashMap<int[], Piece> hmap = new HashMap<int[], Piece>();
		
		Board.createBoard(hmap);
		
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
		int vaakarivi0 = (args[0].toUpperCase().charAt(0)) - 64;
		int vaakarivi1 = (args[1].toUpperCase().charAt(0)) - 64;
 		
		int[] start = new int[] {vaakarivi0, (int)(args[0].charAt(1))};
		int[] finish = new int[] {vaakarivi1, (int)(args[1].charAt(1))};
		
		
		if(hmap.get(start) == null); //virhe

		hmap.get(start).checkMove();
		
		
	}
}


package Chess;

import java.util.ArrayList;
import java.util.HashMap;


public class Board {
	
	public static HashMap<int[], Piece>  createBoard() {
		HashMap<int[], Piece> hmap = new HashMap<int[], Piece>();
		// Alustaa hashmapin joka koostuu laudan koordinaatista ja sillä paikalla
		// olevasta nappulasta

		for (int j = 1; j < 9; j++) {
			for (int i = 3; i < 7; i++) {
				int[] Square = new int[] { j, i };
				hmap.put(Square, null);
			}
		}
		// Luo pelikentän tyhjät ruudut väleille [1,3] [8,6]

		Soldier WhitePawn1 = new Soldier(1);
		Soldier WhitePawn2 = new Soldier(1);
		Soldier WhitePawn3 = new Soldier(1);
		Soldier WhitePawn4 = new Soldier(1);
		Soldier WhitePawn5 = new Soldier(1);
		Soldier WhitePawn6 = new Soldier(1);
		Soldier WhitePawn7 = new Soldier(1);
		Soldier WhitePawn8 = new Soldier(1);

		Soldier BlackPawn1 = new Soldier(2);
		Soldier BlackPawn2 = new Soldier(2);
		Soldier BlackPawn3 = new Soldier(2);
		Soldier BlackPawn4 = new Soldier(2);
		Soldier BlackPawn5 = new Soldier(2);
		Soldier BlackPawn6 = new Soldier(2);
		Soldier BlackPawn7 = new Soldier(2);
		Soldier BlackPawn8 = new Soldier(2);

		Rook WhiteRook1 = new Rook(1);
		Rook WhiteRook2 = new Rook(1);

		Rook BlackRook1 = new Rook(2);
		Rook BlackRook2 = new Rook(2);

		Knight WhiteKnight1 = new Knight(1);
		Knight WhiteKnight2 = new Knight(1);

		Knight BlackKnight1 = new Knight(2);
		Knight BlackKnight2 = new Knight(2);

		Bishop WhiteBishop1 = new Bishop(1);
		Bishop WhiteBishop2 = new Bishop(1);

		Bishop BlackBishop1 = new Bishop(2);
		Bishop BlackBishop2 = new Bishop(2);

		Queen WhiteQueen = new Queen(1);
		Queen BlackQueen = new Queen(2);

		King WhiteKing = new King(1);
		King BlackKing = new King(2);
//Luotiin kaikki nappula oliot

	ArrayList<Piece> WhitePieces = new ArrayList<Piece>();
		WhitePieces.add(WhitePawn1);
		WhitePieces.add(WhitePawn2);
		WhitePieces.add(WhitePawn3);
		WhitePieces.add(WhitePawn4);
		WhitePieces.add(WhitePawn5);
		WhitePieces.add(WhitePawn6);
		WhitePieces.add(WhitePawn7);
		WhitePieces.add(WhitePawn8);
		WhitePieces.add(WhiteRook1);
		WhitePieces.add(WhiteKnight1);
		WhitePieces.add(WhiteBishop1);
		WhitePieces.add(WhiteQueen);
		WhitePieces.add(WhiteKing);
		WhitePieces.add(WhiteBishop2);
		WhitePieces.add(WhiteKnight2);
		WhitePieces.add(WhiteRook2);
		
	ArrayList<Piece> BlackPieces = new ArrayList<Piece>();
		BlackPieces.add(BlackPawn1);
		BlackPieces.add(BlackPawn2);
		BlackPieces.add(BlackPawn3);
		BlackPieces.add(BlackPawn4);
		BlackPieces.add(BlackPawn5);
		BlackPieces.add(BlackPawn6);
		BlackPieces.add(BlackPawn7);
		BlackPieces.add(BlackPawn8);
		BlackPieces.add(BlackRook1);
		BlackPieces.add(BlackKnight1);
		BlackPieces.add(BlackBishop1);
		BlackPieces.add(BlackQueen);
		BlackPieces.add(BlackKing);
		BlackPieces.add(BlackBishop2);
		BlackPieces.add(BlackKnight2);
		BlackPieces.add(BlackRook2);
//Lisataan Nappulat array listoihin

		for (int i = 1; i < 9; i++) {
			int[] Square = new int[] { i, 2 };
			hmap.put(Square, WhitePieces.get(i - 1));
		}
//laittaa Valkoiset sotilaat paikoilleen
		for (int i = 1; i < 9; i++) {
			int[] Square = new int[] { i, 7 };
			hmap.put(Square, BlackPieces.get(i - 1));
//Laittaa mustat sotilaat paikoilleen
		}
		for (int i = 1; i < 9; i++) {
			int[] Square = new int[] { i, 1 };
			hmap.put(Square, WhitePieces.get(8 + i - 1));
		}
		for (int i = 1; i < 9; i++) {
			int[] Square = new int[] { i, 1 };
			hmap.put(Square, WhitePieces.get(8 + i - 1));
		}

		for (int i = 1; i < 9; i++) {
			int[] Square = new int[] { i, 8 };
			hmap.put(Square, BlackPieces.get(8 + i - 1));
		}
//Laittaa kaikki loput nappulat oikeille pakoilleen
return hmap;
	}
}
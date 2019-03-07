package Chess;
import java.util.HashMap;

public class King extends Piece {
	
protected int color;
protected boolean hasBeenChecked = false;
protected boolean hasMoved = false;
	
	public King(int color) { this.color = color; }
	
	
	public boolean checkMove(int[] start, int[] finish) {
		if(Math.abs(start[0] - finish[0]) > 1 || Math.abs(start[1] - finish[1]) > 1)
			return false;
		if((hmap.get(finish)).getColor() != this.color)
			return true;
		
		//checks if king is moved exactly two squares sideways and hasn't been checked/moved
		if(start[1] == finish[1] && Math.abs(start[0]-finish[0])==2 && !hasMoved && !hasBeenChecked) {
			checkCastle(start, finish);
		}
	}
	
	
	
	public boolean checkCastle(int[] king, int[] end) {
		
		if(king[0]-end[0] > 0) {
			for(int i = 1; i < Math.abs(king[0]-end[0]); i++) {
				if()
			}
			
			
			if(hmap.get(king[0], 1).getClass() == Rook) {
				
			}
			
		} 
		else {
			if(hmap.get(king[0], 8).getClass() == Rook && ) {
				
			}
				
		}
			
			
	}
			
			
	
}

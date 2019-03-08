package Chess;
import java.util.HashMap;

public class King extends Piece {
	
protected int color;
protected boolean hasBeenChecked = false;
protected boolean hasMoved = false;
	
	public King(int color) { this.color = color; }
	
	
	public boolean checkMove(int[] start, int[] finish, HashMap<int[], Piece> hmap) {
		
		//checks if king is moved exactly two squares sideways and hasn't been checked/moved
		if(start[1] == finish[1] && Math.abs(start[0]-finish[0])==2 && !hasMoved && !hasBeenChecked) {
			return checkCastle(start, finish, hmap);
		}
		
		if(Math.abs(start[0] - finish[0]) > 1 || Math.abs(start[1] - finish[1]) > 1)
			return false;
		if((hmap.get(finish)).getColor() != this.color)
			return true;
		return false;
	}
	
	
	
	public boolean checkCastle(int[] king, int[] end, HashMap<int[], Piece> hmap) {
		int[] b = new int[] {1, king[1]};
		if(king[0]-end[0] > 0) {
			//checks if squares in-between are empty
			for(int i = 1; i < Math.abs(king[0]-end[0]); i++) {
				int[] a = new int[] {king[0]-i, king[1]};
				if(hmap.get(a) != null) 
					return false;	
			}
			
			//checks if final square contains a rook that hasn't moved
			if(hmap.get(b) instanceof Rook) {
				if(!((Rook)hmap.get(b)).getHasMoved())
					return true;
			}
		} 
		else {
			for(int i = 1; i < Math.abs(king[0]-end[0]); i++) {
				int[] a = new int[] {king[0]+i, king[1]};
				if(hmap.get(a) != null) 
					return false;	
			}
			if(hmap.get(b) instanceof Rook) {
				if(!((Rook)hmap.get(b)).getHasMoved())
					return true;
			}	
		}
		return false;
	}
			
			
	
}

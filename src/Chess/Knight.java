package Chess;
import java.util.HashMap;

public class Knight extends Piece{
	
	protected int color;
	
	public Knight(int color) { this.color = color; }
	
	
	public boolean checkMove(int[] start, int[] finish) {
		if(start.equals(finish))
			return false;
		//checks if the knight moves 2 in some direction and 1 in other.
		if(Math.abs(start[0] - finish[0]) == 2 && Math.abs(start[1] - finish[1]) == 1) {
			if((hmap.get(finish)).getColor() != this.color)
				return true;
		}
		if(Math.abs(start[0] - finish[0]) == 1 && Math.abs(start[1] - finish[1]) == 2) {
			if((hmap.get(finish)).getColor() != this.color)
				return true;
		return false;
		}
	}
		
	
}

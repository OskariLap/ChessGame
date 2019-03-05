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
	}
	
	
	
	//tornitus
	
}

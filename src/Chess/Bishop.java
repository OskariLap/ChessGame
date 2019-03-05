package Chess;
import java.util.HashMap;

public class Bishop extends Piece{

	protected int color;
	
	public Bishop(int color) { this.color = color; }
	
	
	public boolean checkMove(int[] start, int[] finish) {
		
		if(start.equals(finish))
			return false;
		
		//checks if piece isn't moving diagonally
		if(Math.abs(start[0]-finish[0]) != Math.abs(start[1]-finish[1]))
			return false;

		int direction0 = (finish[0] - start[0])/Math.abs(start[0]-finish[0]);
		int direction1 = (finish[1] - start[1])/Math.abs(start[1]-finish[1]);
		
		//checks if all fields inbetween are empty
		for(int i = 1; i < Math.abs(start[0] - finish[0]); i++) {
			if(hmap.get(start[0] + i * direction0, start[1] + i * direction1) != null)
				return false;
		}
		//checks if end square is empty or contains opponents piece
		if((Hmap.get(finish)).getColor() != this.color || Hmap.get(finish) == null)
			return true;
	}
	
	
}


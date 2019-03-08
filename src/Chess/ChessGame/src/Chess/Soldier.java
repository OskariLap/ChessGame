package Chess;
import java.util.HashMap;

public class Soldier extends Piece {
	
	//1 = white, 2 = black, might give third value to "dead" pieces if necessary
	protected int color;
	
	public Soldier(int color) { this.color = color; }	
	

	
	
	public boolean checkMove(int[] start, int[] finish, HashMap<int[], Piece> hmap) {
		if(start.equals(finish))
			return false;
		if(color == 1) {
			//if soldier goes straight forwards
			if(start[0] == finish[0]) {
				//moves double from row 2
				if(start[1] == 2 && finish[1] == 4) {
					int[] a = new int[] {start[0], 3};
					if(hmap.get(a) == null  &&  hmap.get(finish) == null)
						return true;
				}
				//moves normally 1
				if(finish[1] == start[1]+1 && hmap.get(finish) == null)
						return true;
			}
			//diagonally, to eat enemy piece
			if(Math.abs(start[0] - finish[0]) == 1 && finish[1] - start[1] == 1) {
				if((hmap.get(finish)).getColor() == 2)
					return true;
			}
		}
		//black soldiers
		if(color == 2) {
			if(start[0] == finish[0]) {
				if(start[1] == 7 && finish[1] == 5) {
					int[] a = new int[] {start[0], 6};
					if(hmap.get(a) == null  &&  hmap.get(finish) == null)
						return true;
				}
				if(finish[1] == start[1]-1 && hmap.get(finish) == null)
					return true;
			}
			if(Math.abs(start[0] - finish[0]) == 1 && start[1] - finish[1] == 1) {
				if((hmap.get(finish)).getColor() == 1)
					return true;
			}			
		}
		return false;
	}
	
	
	
	
	
	
 //promote()-method if soldier reaches rows 8 or 1.
}
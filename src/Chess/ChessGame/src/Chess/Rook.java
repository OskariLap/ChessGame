package Chess;
import java.util.HashMap;

public class Rook extends Piece {

	protected int color;
	protected boolean hasMoved = false;
	
	public Rook(int color) { this.color = color; }
	
	public boolean getHasMoved() { return hasMoved; }
	
	public boolean checkMove(int[] start, int[] finish, HashMap<int[], Piece> hmap) {
		if(start.equals(finish))
			return false;
		
		//if not on either same row or column
		if(start[0] != finish[0] && start[1] != finish[1])
			return false;
		
		int direction0 = (finish[0] - start[0])/Math.abs(start[0]-finish[0]);
		int direction1 = (finish[1] - start[1])/Math.abs(start[1]-finish[1]);
		
		//if moving on up/down
		if(start[0] == finish[0]) {
			//checks if rows are clear
			for(int i = 1; i < Math.abs(start[1] - finish[1]); i++) {
				int[] a = new int[] {start[0], start[1] + i * direction1};
				if(hmap.get(a) == null)
					return false;
			}
		}
		//if moving sideways
		if(start[1] == finish[1]) {
				//checks if rows are clear
				for(int i = 1; i < Math.abs(start[0] - finish[0]); i++) {
					int[] a = new int[] {start[0] + i * direction0, start[1]};
					if(hmap.get(a) != null)
						return false;
				}
		}
		if((hmap.get(finish)).getColor() != this.getColor() || hmap.get(finish) == null)
			return true;
		return false;
	}
	
}

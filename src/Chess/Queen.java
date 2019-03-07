package Chess;
public class Queen extends Piece {

	protected int color;
	
	public Queen(int color) { this.color = color;}
	
	
	public boolean checkMove(int[] start, int[] finish) {
		if(start.equals(finish))
			return false;
		
		//if not moving like bishop nor rook
		if(start[0] != finish[0] && start[1] != finish[1] && Math.abs(start[0]-finish[0]) != Math.abs(start[1]-finish[1]))
			return false;
		
		int direction0 = (finish[0] - start[0])/Math.abs(start[0]-finish[0]);
		int direction1 = (finish[1] - start[1])/Math.abs(start[1]-finish[1]);
		
		//check if moves like rook. if yes, checks rows
		if(start[0] == finish[0]) {
			for(int i = 1; i < Math.abs(start[1] - finish[1]); i++) {
				if(hmap.get(start[0], start[1] + i * direction1) == null)
					return false;	
			}
		}
		if(start[1] == finish[1]) {
			for(int i = 1; i < Math.abs(start[0] - finish[0]); i++) {
				if(hmap.get(start[0] + i * direction0, start[1]) != null)
					return false;
			}
		}
		//otherwise has to move like bishop, checking diagonals
		for(int i = 1; i < Math.abs(start[0] - finish[0]); i++) {
			if(hmap.get(start[0] + i * direction0, start[1] + i * direction1) != null)
				return false;
		}
		//checks if end square is empty or contains opponents piece
		if((hmap.get(finish)).getColor() != this.color || hmap.get(finish) == null)
			return true;
		return false;
	}
	
	
}

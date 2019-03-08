package Chess;
import java.util.HashMap;

public abstract class Piece {
	
	protected int color;
	protected int[] coordinate;
	
	public Piece() {
		
	}
	
	abstract boolean checkMove(int[] start, int[] finish, HashMap<int[], Piece> hmap);
		
	public int getColor() {
		return this.color;
	}
	
}

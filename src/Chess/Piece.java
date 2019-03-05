package Chess;
public abstract class Piece {
	
	protected int color;
	
	abstract boolean checkMove(int[] start, int[] finish);
		
	public int getColor() {
		return this.color;
	}
	
}

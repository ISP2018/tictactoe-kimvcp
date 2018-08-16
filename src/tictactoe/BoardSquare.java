package tictactoe;

import javafx.scene.shape.Rectangle;

/**
 * A single square on the game board.
 */
public class BoardSquare extends Rectangle {
	/** square knows its own row and column. */
	private int row;
	private int column;
	
	public BoardSquare(int row, int col, int size) {
		super(100, 100);
		this.row = row;
		this.column = col;
	}

	/**
	 * Method for getting row of the square.
	 * 
	 * @return row
	 */
	public int getRow() {
		return this.row;
	}
	
	/**
	 * Method for getting column of the square.
	 * 
	 * @return column
	 */
	public int getColumn() {
		return this.column;
	}

}

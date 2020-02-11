package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;	
	}

	protected Board getBoard() { // quero que pe�a seja acessada apenas pelo pacote tabuleiro.
		return board;
	}

	
}

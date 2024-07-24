package CodSoft;

public class GameLogic {
	private char[][]board;
	private char currentPlayer;
	private boolean gameWon;
	
	public GameLogic() {
		board= new char[3][3];
		currentPlayer = 'X';
		gameWon = false;
		initializeBoard();
	}
	public char getCurrentPlayer() {
		return currentPlayer;
	}
	public boolean isGameWon() {
		return gameWon;
	}
	public void initializeBoard() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				board[i][j]='-';
			}
		}
		currentPlayer = 'X';
		gameWon = false;
	}
	public boolean makeMove(int row,int col) {
		if(board[row][col]=='-') {
			board[row][col]=currentPlayer;
			if(checkForWinner()) {
				gameWon = true;
			}
			else {
				switchPlayer();
			}
			return true;
		}
		return false;
	}
	private void switchPlayer() {
		currentPlayer = (currentPlayer == 'X')?'O':'X';		
	}
	private boolean checkForWinner() {
		for(int i =0; i<3;i++) {
			if(board[i][0]==currentPlayer && board[i][1]==currentPlayer && board[i][2]==currentPlayer) {
				return true;
			}
			if(board[0][i]==currentPlayer && board[1][i]==currentPlayer && board[2][i]==currentPlayer) {
				return true;
			}
		}
		if(board[0][0]==currentPlayer && board[1][1]==currentPlayer && board[2][2]==currentPlayer) {
			return true;
		}
		if(board[0][2]==currentPlayer && board[1][1]==currentPlayer && board[2][0]==currentPlayer) {
			return true;
		}
		return false;
	}
	public boolean isBoardFull() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(board[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}
}

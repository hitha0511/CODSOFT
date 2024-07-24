package CodSoft;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GamePanel extends JPanel {
	private GameLogic gameLogic;
	private JButton[][] buttons;
	private boolean againstAI;
	private Random random;
	private Runnable showMainMenu;

	public GamePanel(boolean againstAI,Runnable showMainMenu){
		this.againstAI = againstAI;
		this.showMainMenu = showMainMenu;
		gameLogic = new GameLogic();
		random = new Random();
		setLayout(new BorderLayout());
		JPanel boardPanel= new JPanel();
		boardPanel.setLayout(new GridLayout(3,3));
		buttons = new JButton[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				buttons[i][j] = new JButton("-");
				buttons[i][j].setFont(new Font("Arial", Font.PLAIN,60));
				buttons[i][j].setFocusPainted(false);
				buttons[i][j].addActionListener(new ButtonClickListener(i,j));
				boardPanel.add(buttons[i][j]);
			}
		}
		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(1,2));
		
		JButton restartButton = new JButton("Restart");
		restartButton.setFont(new Font("Arial", Font.PLAIN,18));
		restartButton.addActionListener(e -> {
			resetGame();
			showMainMenu.run();
		});
		controlPanel.add(restartButton);
		
		JButton endButton = new JButton("End");
		endButton.setFont(new Font("Arial", Font.PLAIN,18));
		endButton.addActionListener(e -> showMainMenu.run());
		controlPanel.add(endButton);
		
		add(boardPanel, BorderLayout.CENTER);
		add(controlPanel, BorderLayout.SOUTH);
	}
	private class ButtonClickListener implements ActionListener{
		private int row;
		private int col;
		public ButtonClickListener(int row,int col) {
			this.row = row;
			this.col = col;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(!gameLogic.isGameWon() && gameLogic.makeMove(row, col)) {
				buttons[row][col].setText(String.valueOf(gameLogic.getCurrentPlayer() == 'X' ? 'O' : 'X'));
				if(gameLogic.isGameWon()) {
					JOptionPane.showMessageDialog(null, "Player " + (gameLogic.getCurrentPlayer() == 'X' ? 'O' : 'X') + " wins!");
					disableButtons();
				}
				else if(gameLogic.isBoardFull()) {
					JOptionPane.showMessageDialog(null, "It's a tie!");
				}
				else if(againstAI && gameLogic.getCurrentPlayer() == 'O') {
					aiMove();
				}
			}
		}
	}
	private void disableButtons() {
		for(int i =0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				buttons[i][j].setEnabled(false);
			}
		}
	}
	private void resetGame() {
		gameLogic.initializeBoard();
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				buttons[i][j].setText("-");
				buttons[i][j].setEnabled(true);
			}
		}
	}
	private void aiMove() {
		boolean moveMade = false;
		while(!moveMade){
			int row = random.nextInt(3);
			int col = random.nextInt(3);
			if(gameLogic.makeMove(row, col)) {
				buttons[row][col].setText("O");
				moveMade = true;
				if(gameLogic.isGameWon()) {
					JOptionPane.showMessageDialog(null, "Bot wins!");
					disableButtons();
				}
				else if(gameLogic.isBoardFull()) {
					JOptionPane.showMessageDialog(null, "It's a tie!");
				}
			}
		}
	}
}

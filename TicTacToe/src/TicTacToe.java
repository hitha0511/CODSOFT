package CodSoft;
import javax.swing.*;
import java.awt.*;
public class TicTacToe {
	private JFrame frame;
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			TicTacToe tic = new TicTacToe();
			tic.showMainMenu();
		});
	}

	public TicTacToe() {
		frame = new JFrame("TIC-TAC-TOE");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,450);
		frame.setVisible(true);
	}
	public void showMainMenu() {
		JPanel mainMenu = new JPanel();
		mainMenu.setLayout(new GridLayout(3,1));
		JLabel title = new JLabel("TIC-TAC-TOE", SwingConstants.CENTER);
		
		title.setFont(new Font("Arial", Font.BOLD,24));
		mainMenu.add(title);
		
		JButton twoPlayerButton = new JButton("Two Players");
		twoPlayerButton.setFont(new Font("Arial", Font.PLAIN,18));
		twoPlayerButton.addActionListener(e -> startGame(false));
		mainMenu.add(twoPlayerButton);
		
		JButton playAgainstAIButton = new JButton("Play Against Bot");
		playAgainstAIButton.setFont(new Font("Arial",Font.PLAIN,18));
		playAgainstAIButton.addActionListener(e -> startGame(true));
		mainMenu.add(playAgainstAIButton);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(mainMenu);
		frame.revalidate();
		frame.repaint();
		
	}
	private void startGame(boolean againstAI) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(new GamePanel(againstAI, this::showMainMenu));
		frame.revalidate();
		frame.repaint();
	}
}

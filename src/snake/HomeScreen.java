package snake;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HomeScreen {
	private JFrame frame;
	private JButton startB;
	private JButton exitB;
	public int width = 805, height = 700;
	
	public HomeScreen() {
		frame= new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setLayout(null);
		frame.setVisible(true);
		
		startB = new JButton("JOGAR");
		startB.setBounds(250, 100, 300, 100);
		frame.add(startB);
		
		exitB = new JButton("SAIR");
		exitB.setBounds(250, 300, 300, 100);
		frame.add(exitB);
		
		startB.addActionListener(new HomeScreenListener(this));
		exitB.addActionListener(new HomeScreenListener(this));
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JButton getStartB() {
		return startB;
	}

	public void setStartB(JButton startB) {
		this.startB = startB;
	}

	public JButton getExitB() {
		return exitB;
	}

	public void setExitB(JButton exitB) {
		this.exitB = exitB;
	}
	
}

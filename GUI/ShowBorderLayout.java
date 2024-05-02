import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

class ShowBorderLayout extends JFrame{
	public ShowBorderLayout(){
		setLayout(new BorderLayout(5, 10));
		add(new JButton("EAST"), BorderLayout.EAST);
		add(new JButton("SOUTH"), BorderLayout.SOUTH);
		add(new JButton("WEST"), BorderLayout.WEST);
		add(new JButton("NORTH"), BorderLayout.NORTH);
		add(new JButton("CENTER"), BorderLayout.CENTER);
	}
	
	public static void main(String[] args){
		ShowBorderLayout frame = new ShowBorderLayout();
		frame.setTitle("Show BorderLayout");
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
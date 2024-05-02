import java.awt.*;
import javax.swing.*;

class TestPanel extends JFrame{
	public TestPanel(){
		JPanel p1 = new JPanel();
		
		p1.setLayout(new GridLayout(4, 3));
		
		for(int i=1; i<=9; i++){
			p1.add(new JButton(""+i));
		}
		p1.add(new JButton(""+0));
		p1.add(new JButton("START"));
		p1.add(new JButton("STOP"));
		
		JPanel p2 = new JPanel(new BorderLayout());
		p2.add(new JTextField("Time To Be Displayed Here"), BorderLayout.NORTH);
		p2.add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.EAST);
		add(new JButton("Food To Be Placed Here"), BorderLayout.CENTER);
		
	}
	
	public static void main(String[] args){
		TestPanel frame = new TestPanel();
		frame.setTitle("The Front view of a Microwave Oven");
		frame.setSize(400, 250);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
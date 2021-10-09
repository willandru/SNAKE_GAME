import javax.swing.JFrame;

public class Frame extends JFrame{

	Frame (){
		this.add(new Panel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack(); // If we add components to a JFrame, pack() will take the frame and fit it whit the components according to the size
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}

package classes;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;


public class Task extends JPanel{

	private JLabel index;
	private JTextField taskName;
	private JButton done;
	private boolean checked;

	public Task() {
		this.setPreferredSize(new Dimension(40,20));
		this.setBackground(Color.pink);
		this.setLayout(new BorderLayout());

		checked = false;


		index = new JLabel();
		index.setPreferredSize(new Dimension(20, 10));
		index.setHorizontalAlignment(JLabel.CENTER);
		this.add(index, BorderLayout.WEST);

		taskName = new JTextField("My task...");
		taskName.setBorder(new LineBorder(new java.awt.Color(254, 204, 153), 2));
		this.add(taskName,BorderLayout.CENTER);

		done = new JButton("done");
		done.setPreferredSize(new Dimension(50, 20));
		this.add(done, BorderLayout.EAST);


	}

	public String setIndex(int i) {
		index.setText(i+"");
		return index.getText();
	}
	
	
	public void changeState() {
		taskName.setBackground(new java.awt.Color(155, 250, 155));
		taskName.setBorder(new LineBorder(new java.awt.Color(155, 255, 155), 2));
		this.setBackground(new java.awt.Color(155, 250, 155));
		checked=true;
	}

	public JButton getDone() {
		return done;
	}

	public boolean greenTask() {
		return checked;
	}



}

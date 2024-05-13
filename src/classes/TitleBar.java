package classes;


import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Dimension;
import java.awt.Font;

public class TitleBar extends JPanel{
	
	public TitleBar(){
	
		this.setPreferredSize(new Dimension(200, 60));
		this.setBackground(new java.awt.Color(255, 229, 204));
		this.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1));
		
		JLabel titleText = new JLabel("To Do List");
		titleText.setPreferredSize(new Dimension(200, 60));
		titleText.setFont(new Font("Sans-serif", Font.BOLD | Font.ITALIC, 20));
		titleText.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(titleText);
		
	}

}

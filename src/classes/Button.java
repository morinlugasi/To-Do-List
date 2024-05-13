package classes;


import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class Button extends JPanel{

	private JButton newTask;
	private JButton removeTask;
	

	 Button() {
		this.setPreferredSize(new Dimension(200, 60));
			
		newTask = new JButton("Add Task");
		this.add(newTask);
		
		removeTask= new JButton("Clear Completed Tasks");
		this.add(removeTask);		
		
		this.setBackground(new java.awt.Color(255, 229, 204));
		this.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1));
		
		
	}
	 
	public JButton getNewTask() {
		return newTask;
	}
	
	public JButton getRemoveTask() {
		return removeTask;
	}

}

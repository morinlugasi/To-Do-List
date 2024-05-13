package classes;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

public class List extends JPanel {

	public List() {
		GridLayout layout = new GridLayout(10,1);
		layout.setVgap(5);
		this.setBackground(new java.awt.Color(255, 229, 204));
		this.setLayout(layout);	

	}

	public void updateIndexs() {
		Component [] listTasks = this.getComponents();
		for(int i=0; i<listTasks.length; i++) {
			if(listTasks[i] instanceof Task) {
				((Task) listTasks[i]).setIndex(i+1);
			}
		}
	}

	public void removeCompletedTasks() {
		Component [] listTasks = getComponents();
		for(Component task : listTasks ) {
			if(task instanceof Task) {
				if(((Task) task).greenTask()){
					remove(task);
					updateIndexs();
				}
			}
		}
	}

}

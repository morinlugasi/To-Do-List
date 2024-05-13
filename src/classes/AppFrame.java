package classes;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.BorderLayout;


public class AppFrame extends JFrame{

	private int counterTasks=0;
	private TitleBar titleBar; 
	private Button button;
	private List list;
	private JButton newTask;
	private JButton remove;


	public AppFrame(String title) {

		this.setSize(400,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle(title);


		titleBar = new TitleBar();
		list = new List();
		button = new Button();

		this.add(titleBar, BorderLayout.NORTH);
		this.add(button, BorderLayout.SOUTH);
		this.add(list, BorderLayout.CENTER);

		newTask = button.getNewTask();
		remove = button.getRemoveTask();

		addListeners();	

	}

	public void addListeners() {

		newTask.addMouseListener(new MouseAdapter() {

			public void mousePressed(MouseEvent e) {
				Task task = new Task();
				list.add(task);
				counterTasks++;
				task.setIndex(counterTasks);
				list.updateIndexs();
				

				task.getDone().addMouseListener(new MouseAdapter() {

					public void mousePressed(MouseEvent e) {
						task.changeState();
						revalidate();

					}
				});	
				revalidate();
			}

		});
		
		remove.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				list.removeCompletedTasks();
				revalidate();
			}
		});


	}



}

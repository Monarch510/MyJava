package designModule.Window;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainWindow extends JFrame implements ActionListener{
	private static SmallWindow internalFrame;
	Container contentPane = this.getContentPane();
	
	public MainWindow() {
		super("主窗体");
		contentPane.setLayout(new BorderLayout());
		JButton button = new JButton("创建一个子窗体");
		button.addActionListener(this);
		contentPane.add(button,BorderLayout.SOUTH);
		this.setLocation(500, 300);
		this.setSize(500,500);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		internalFrame = SmallWindow.getInstance();
//		internalFrame.setLocation(100, 100);
		internalFrame.setSize(200,200);
		internalFrame.setVisible(true);
		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane);
		desktopPane.add(internalFrame);
		try {
			internalFrame.setSelected(true);
		}
		catch(java.beans.PropertyVetoException ex){
			System.out.println("Exception while selecting!");
		}
	}
}
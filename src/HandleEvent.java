import javax.swing.*;
import java.awt.event.*;
public class HandleEvent extends JFrame {

	public HandleEvent(){
		JButton jbtOK = new JButton("OK");
		JButton jbtCancel = new JButton("Cancle");
		
		JPanel panel = new JPanel();
		panel.add(jbtOK);
		panel.add(jbtCancel);
		
		add(panel);
		
		OKListenerClass listener1  = new OKListenerClass();
		CancelListenerClass listener2 = new CancelListenerClass();
		
		jbtOK.addActionListener(listener1);
		jbtCancel.addActionListener(listener2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new HandleEvent();
		frame.setTitle("Handle Event");
		frame.setSize(200, 150);
		frame.setLocation(200,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	class OKListenerClass implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("OK button clicked");
		}
	}
	class CancelListenerClass implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Cancel button clicked");
		}
		
	}
}


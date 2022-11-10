package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class ClickRandomLocation extends JFrame implements MouseListener{
	
	JPanel p = new JPanel();
	JLabel lb = new JLabel("나잡아 봐라");
	
	
	ClickRandomLocation(){
		
		p.setLayout(null);
		setLayout(new BorderLayout());
		
		add(p);
		lb.setBounds(50,50,100,40);
		p.add(lb);
		
		lb.addMouseListener(this);
		
		setTitle("클릭 연습");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ClickRandomLocation();
		

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
		int x = (int)(Math.random()*(p.getWidth()-100));
		int y = (int)(Math.random()*(p.getHeight()-40));
		lb.setBounds(x,y,100,40);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

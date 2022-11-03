package unit03.EventExam;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class HelloKeyEnter extends JFrame implements KeyListener{
	
	JPanel p = new JPanel();
	JLabel lb = new JLabel("<Enter>Ű�� ������ �ٲ�ϴ�.");
	
	HelloKeyEnter(){
		add(p);
		p.add(lb);
		
		p.addKeyListener(this);
		
		
		setTitle("Ű�̺�Ʈ");
		setSize(300,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		p.setFocusable(true);
		p.requestFocus();
	}
	
	public static void main(String[] args) {
		new HelloKeyEnter();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int r = (int)(Math.random()*256);
		int g = (int)(Math.random()*256);
		int b = (int)(Math.random()*256);
		
		
		switch(e.getKeyChar()) {
		case '\n':
			lb.setText("r = "+ r + "g = "+ g + "b = "+ b);
			p.setBackground(new Color(r, g, b));
			break;
		case 'q':
			System.exit(0);
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
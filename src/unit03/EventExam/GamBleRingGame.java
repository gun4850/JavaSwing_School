package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class GamBleRingGame extends JFrame implements KeyListener{
	
	JLabel lb1 = new JLabel("0",JLabel.CENTER);
	JLabel lb2 = new JLabel("0",JLabel.CENTER);
	JLabel lb3 = new JLabel("0",JLabel.CENTER);
	JLabel out = new JLabel("시작합니다.",JLabel.CENTER);
	GamBleRingGame(){
		JPanel p = new JPanel();
		
		p.setLayout(null);
		setLayout(new BorderLayout());
		
		lb1.setBounds(30,50,60,30);
		lb2.setBounds(110,50,60,30);
		lb3.setBounds(180,50,60,30);
		
		lb1.setOpaque(true);
		lb1.setBackground(Color.pink);
		lb2.setOpaque(true);
		lb2.setBackground(Color.pink);
		lb3.setOpaque(true);
		lb3.setBackground(Color.pink);
		

		
		p.add(lb1);
		p.add(lb2);
		p.add(lb3);
		p.add(out);
		add(p);
		add(out,BorderLayout.SOUTH);
		
		p.addKeyListener(this);
		
		setTitle("겜블링게임");
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		p.setFocusable(true);
		p.requestFocus();
	}
	
	public static void main(String[] args) {
		new GamBleRingGame();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyChar()) {
		case '\n':
			int num1 = (int)(Math.random()*5);
			int num2 = (int)(Math.random()*5);
			int num3 = (int)(Math.random()*5);
			
			String number2 = Integer.toString(num2);
			String number1 = Integer.toString(num1);
			String number3 = Integer.toString(num3);
			
			lb1.setText(number1);
			lb2.setText(number2);
			lb3.setText(number3);
			
			if(num1==num2&&num2==num3) {
				out.setText("축하합니다!");
			}else {
				out.setText("아쉽군요~");
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

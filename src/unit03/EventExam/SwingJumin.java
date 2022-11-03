package unit03.EventExam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class SwingJumin extends JFrame implements KeyListener, ActionListener{
	
	JTextField tf1 = new JTextField(10);
	JTextField tf2 = new JTextField(10);
	JButton	   btn = new JButton("버튼");
	JLabel      lb = new JLabel("-");
	
	SwingJumin(){
		
		JPanel p = new JPanel();
		p.add(tf1);
		p.add(lb);
		p.add(tf2);
		p.add(btn);
		add(p);
		
		tf1.addKeyListener(this);
		tf2.addKeyListener(this);
		btn.addActionListener(this);
		//JOptionPane.showMessageDialog(null,"보여줄내용");
		
		setTitle("주민번호 분석");
		setSize(400,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingJumin();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String first = tf1.getText();
		String Second= tf2.getText();
		String N = "";
		if(e.getSource()==btn) {
			
			String num2 = Second.substring(0,1);
			int number2 = Integer.parseInt(num2);
			if(number2 == 1||number2 == 2) {
				N = "19";
			}else if(number2 == 3||number2 == 4) {
				N = "20";
			}
			String num1 = first.substring(0,2);
			
			JOptionPane.showMessageDialog(null,"당신의 생일은 "+N+num1+"년"+first.substring(2,4)+"월"+first.substring(4,6)+"일입니다");
		
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(tf2.getText().trim().length()>1) {
			switch(e.getKeyChar()) {
			case '\n':
				btn.doClick();
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int N1 = tf1.getText().trim().length();
		if(N1==6) {
			tf2.requestFocus();
		}
	}

}

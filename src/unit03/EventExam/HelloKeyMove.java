package unit03.EventExam;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class HelloKeyMove extends JFrame implements KeyListener{
	
	/*
	 getKeyChar() : 입력된 키의 유니코드 값을 리턴
	 if(e.getkeyChar() == 'q')
	 getKeyCode() : 모든키에 대해 정수형의 키코드 값을 리턴.
	 keyEvent 클래스에 선언된 가상키표를 참고
	 
	 키 이벤트는 모든 컴포넌트가 받을 수 있다.
	 따라서 특정 컴포넌트에 (예제에서는 패널) 강제로 포커스를 줘서
	 키 이벤트를 받도록 하기 위해서는 아래 코드 필요
	 
	 p.setFocusable(true);
	 p.requestFocus();
	 **setVisible(true)다음에 실행시키기**
	 */
	JPanel p = new JPanel();
	JLabel lb = new JLabel("Hello");
	
	HelloKeyMove(){
		
		add(p);
		
		p.setLayout(null); //절대값 레이아웃
		
		p.add(lb);
		
		lb.setLocation(50,50);
		lb.setSize(300,250);
		
		p.addKeyListener(this);
		
		setTitle("키 이벤트 예제");
		setSize(300,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		p.setFocusable(true);
		p.requestFocus();
	}
	
	public static void main(String[] args) {
		new HelloKeyMove();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keycode = e.getKeyCode();
		
		switch(keycode) {
		case KeyEvent.VK_UP:
			
			lb.setLocation(lb.getX(),lb.getY()-10);
			break;
		case KeyEvent.VK_DOWN:

			lb.setLocation(lb.getX(),lb.getY()+10);
			break;
		case KeyEvent.VK_LEFT:

			lb.setLocation(lb.getX()-10,lb.getY());
			break;
			
		case  KeyEvent.VK_RIGHT:

			lb.setLocation(lb.getX()+10,lb.getY());
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

package unit03.EventExam;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class HelloKeyMove extends JFrame implements KeyListener{
	
	/*
	 getKeyChar() : �Էµ� Ű�� �����ڵ� ���� ����
	 if(e.getkeyChar() == 'q')
	 getKeyCode() : ���Ű�� ���� �������� Ű�ڵ� ���� ����.
	 keyEvent Ŭ������ ����� ����Űǥ�� ����
	 
	 Ű �̺�Ʈ�� ��� ������Ʈ�� ���� �� �ִ�.
	 ���� Ư�� ������Ʈ�� (���������� �г�) ������ ��Ŀ���� �༭
	 Ű �̺�Ʈ�� �޵��� �ϱ� ���ؼ��� �Ʒ� �ڵ� �ʿ�
	 
	 p.setFocusable(true);
	 p.requestFocus();
	 **setVisible(true)������ �����Ű��**
	 */
	JPanel p = new JPanel();
	JLabel lb = new JLabel("Hello");
	
	HelloKeyMove(){
		
		add(p);
		
		p.setLayout(null); //���밪 ���̾ƿ�
		
		p.add(lb);
		
		lb.setLocation(50,50);
		lb.setSize(300,250);
		
		p.addKeyListener(this);
		
		setTitle("Ű �̺�Ʈ ����");
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

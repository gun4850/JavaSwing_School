package unit03.EventExam;

import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.*;

public class MouseWheelEventEx extends JFrame implements MouseWheelListener{
	JPanel p = new JPanel();
	JLabel lb = new JLabel("LOVE JAVA");
	int fontSize = 30;
	MouseWheelEventEx() {
		add(lb);
		lb.setFont(new Font("±¼¸²Ã¼",Font.BOLD,fontSize));
		lb.addMouseWheelListener(this);
		
		setTitle("¸¶¿ì½º ÈÙ");
		setSize(600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseWheelEventEx();

	}
	
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
        int N = e.getWheelRotation();
        if(N<0){
            fontSize+=5;
        }
        else{
            fontSize-=5;
        }
        lb.setFont(new Font("±¼¸²Ã¼",Font.BOLD,fontSize));
	}
}

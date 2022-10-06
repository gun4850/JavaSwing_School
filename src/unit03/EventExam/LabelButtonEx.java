package unit03.EventExam;

import javax.swing.*;

public class LabelButtonEx extends JFrame{
	
	LabelButtonEx() {
		
		JPanel p = new JPanel();
		
		add(p);//
		
		JLabel lb = new JLabel("���ӽ� �����Դϴ�");
		p.add(lb);
		
		ImageIcon img = new ImageIcon("img/gosling.jpg");
		JLabel lbImage = new JLabel(img);
		p.add(lbImage);
		
		ImageIcon normalIcon = new ImageIcon("img/normalIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("img/pressedIcon.gif");
		ImageIcon rollovericon = new ImageIcon("img/rollovericon.gif");
		
		JButton btn = new JButton("call~",normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rollovericon);
		p.add(btn);
		
		setTitle("�󺧰� ��ư����");
		setSize(300, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LabelButtonEx();
	}

}

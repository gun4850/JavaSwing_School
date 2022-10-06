package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingLogin extends JFrame implements ActionListener{
	
	JTextField tfid = new JTextField();
	JPasswordField tfPwd = new JPasswordField();
	JButton btnLogin = new JButton("�α���");
	JButton btnCancel = new JButton("���");
	JLabel lbResult = new JLabel("��� ���",JLabel.LEFT);
	SwingLogin(){
		
		setLayout(new BorderLayout());
		
		
		//���� ���̾ƿ�
		ImageIcon robot = new ImageIcon("img/robot.png");
		JLabel lbLogo = new JLabel(robot);
		add(lbLogo, BorderLayout.NORTH);
		
		//���� ���̾ƿ�
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(0,2));
		
		JLabel lbId = new JLabel("���̵�",JLabel.CENTER);
		p.add(lbId);
		p.add(tfid);
		
		JLabel lPwd = new JLabel("��й�ȣ",JLabel.CENTER);
		p.add(lPwd);
		p.add(tfPwd);
		
		btnLogin.setBackground(Color.yellow);
		btnCancel.setBackground(Color.pink);
		
		p.add(btnLogin);
		p.add(btnCancel);
		
		add(p,BorderLayout.CENTER);
		
		
		add(lbResult,BorderLayout.SOUTH);
		
		btnLogin.addActionListener(this);
		btnCancel.addActionListener(this);
		
		setTitle("�α���");
		setSize(300, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingLogin();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnLogin) {
			String tf = tfid.getText();
			String tP = new String(tfPwd.getPassword());
			if(tf.length()==0) 		lbResult.setText("���̵� �Է��ϼ���");
			else if(tP.length()==0) lbResult.setText("��й�ȣ�� �Է��ϼ���");
			else					lbResult.setText(tf+"���� ��й�ȣ�� "+tP+"�Դϴ�");
		}else if(e.getSource()==btnCancel) {
			lbResult.setText("����Ͽ����ϴ�");
			tfid.setText("");
			tfPwd.setText("");
		}
		
	}
	
	

}

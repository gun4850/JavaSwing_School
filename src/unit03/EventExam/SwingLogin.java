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
	JButton btnLogin = new JButton("로그인");
	JButton btnCancel = new JButton("취소");
	JLabel lbResult = new JLabel("결과 출력",JLabel.LEFT);
	SwingLogin(){
		
		setLayout(new BorderLayout());
		
		
		//븍쪽 레이아웃
		ImageIcon robot = new ImageIcon("img/robot.png");
		JLabel lbLogo = new JLabel(robot);
		add(lbLogo, BorderLayout.NORTH);
		
		//센터 레이아웃
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(0,2));
		
		JLabel lbId = new JLabel("아이디",JLabel.CENTER);
		p.add(lbId);
		p.add(tfid);
		
		JLabel lPwd = new JLabel("비밀번호",JLabel.CENTER);
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
		
		setTitle("로그인");
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
			if(tf.length()==0) 		lbResult.setText("아이디를 입력하세요");
			else if(tP.length()==0) lbResult.setText("비밀번호를 입력하세요");
			else					lbResult.setText(tf+"님의 비밀번호는 "+tP+"입니다");
		}else if(e.getSource()==btnCancel) {
			lbResult.setText("취소하였습니다");
			tfid.setText("");
			tfPwd.setText("");
		}
		
	}
	
	

}

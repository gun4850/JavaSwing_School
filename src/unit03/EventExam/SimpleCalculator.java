package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleCalculator extends JFrame implements ActionListener{
	JTextField Input  = new JTextField(10);
	JTextField output = new JTextField(10);
	JLabel In  = new JLabel("수식");
	JLabel out = new JLabel("출력");
	
	String num1, num2;
	char oper;
	
	JButton [] bt = new JButton[16];
	String [] ButtonName = {
		"0","1","2","3","4","5","6",
		"7","8","9","CE","계산","+","-","x","/",
	};
	
	SimpleCalculator(){
		setLayout(new BorderLayout());
		JPanel p = new JPanel();
		
		JPanel p1 = new JPanel();
		
		add(p1, BorderLayout.NORTH);
		
		p1.add(In);
		p1.add(Input);
		p1.add(out);
		p1.add(output);
		
		p.setLayout(new GridLayout(0,4));
		for(int i = 0;i<16;i++) {
			bt[i] = new JButton(ButtonName[i]);
			p.add(bt[i]);
			bt[i].addActionListener(this);
		}
		add(p,BorderLayout.CENTER);
		setTitle("간단한 계산기");
		setSize(350,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SimpleCalculator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="CE") {
			Input.setText("");
			output.setText("");
		}else if(e.getActionCommand()=="계산") {
			String Na = Input.getText();
			int N1 = 0;
			int N2 = 0;
			char op=' ';
			for(int i = 0;i < Na.length();i++) {
				
				if(Na.charAt(i)=='x'||Na.charAt(i)=='/'||Na.charAt(i)=='+'||Na.charAt(i)=='-') {
					op=Na.charAt(i);
					num1=Na.substring(0, i);
					num2=Na.substring(i+1);
					N1=Integer.parseInt(num1);
					N2=Integer.parseInt(num2);					
				}
			}

			if(op=='x') {
				int ls = N1*N2;
				String N   = Integer.toString(ls);
				output.setText(N);
			}else if(op=='/') {
				String N   = Integer.toString(N1/N2);
				output.setText(N);					
			}else if(op=='+') {
				String N   = Integer.toString(N1+N2);
				output.setText(N);
			}else if(op=='-') {
				String N   = Integer.toString(N1-N2);
				output.setText(N);
			}
			
		}else {
			String Name = Input.getText();
			Input.setText(Name+e.getActionCommand());
		}
	}
}

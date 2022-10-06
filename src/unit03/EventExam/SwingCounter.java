package unit03.EventExam;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingCounter extends JFrame implements ActionListener{
	
	JLabel lb = new JLabel("카운터값");
	JTextField tf = new JTextField("0",5);
	JButton btnlnc = new JButton("증가");
	JButton btnDec = new JButton("감소");
	JButton btnCls = new JButton("초기화");
	
	SwingCounter(){
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		p.add(lb);
		p.add(tf);
		p.add(btnlnc);
		p.add(btnDec);
		p.add(btnCls);
		add(p);
		
		btnlnc.addActionListener(this);
		btnDec.addActionListener(this);
		btnCls.addActionListener(this);
		
		setTitle("간단카운터");
		setSize(400,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingCounter();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnlnc) {
			String text = tf.getText().trim();
			int N = Integer.parseInt(text);
			N+=1;
			String T = Integer.toString(N);
			tf.setText(T);
		}
		else if(e.getSource()==btnDec) {
			String text = tf.getText().trim();
			int N = Integer.parseInt(text);
			N-=1;
			String T = Integer.toString(N);
			tf.setText(T);
		}
		else if(e.getSource()==btnCls) {
			String text = tf.getText().trim();
			int N = Integer.parseInt(text);		
			N=0;
			String T = Integer.toString(N);
			tf.setText(T);
		}
	}
	//JTextArea ta = new JTextArea(10,30);
	//JScrollPane

}

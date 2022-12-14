package unit03.EventExam;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TextAreaEx extends JFrame implements ActionListener{
	JLabel lb = new JLabel("입력후<Enter>키를 입력하세요");
	JTextField tf = new JTextField(20);
	JTextArea ta = new JTextArea(7,20);
	JScrollPane sp = new JScrollPane(ta);
	
	
	
	TextAreaEx(){
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		p.add(lb);
		p.add(tf);
		p.add(sp);
		add(p);
		
		
		
		tf.addActionListener(this);
		
		setTitle("텍스트영역만들기");
		setSize(300,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextAreaEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tf) {
			String Text = tf.getText()+"\n";
			ta.append(Text);
			tf.setText("");
		}
		
	}

}

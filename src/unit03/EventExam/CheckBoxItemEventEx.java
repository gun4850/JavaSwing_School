package unit03.EventExam;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckBoxItemEventEx extends JFrame implements ItemListener{
	JLabel lb = new JLabel("��� 100��, �� 500��, ü�� 2000��");
	JCheckBox fruit1 = new JCheckBox("���",false);
	JCheckBox fruit2 = new JCheckBox("��",false);
	JCheckBox fruit3 = new JCheckBox("ü��",false);
	int sum=0;
	
	JLabel lb_reult = new JLabel("���� "+sum+"���Դϴ�");
	CheckBoxItemEventEx() {
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		p.add(lb);
		p.add(fruit1);
		p.add(fruit2);
		p.add(fruit3);
		p.add(lb_reult);
		add(p);
		
		
		fruit1.addItemListener(this);
		fruit2.addItemListener(this);
		fruit3.addItemListener(this);
		
		setTitle("üũ�ڽ� - ������ �ջ��ϴ� ���α׷�");
		setSize(250,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CheckBoxItemEventEx();
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange()==ItemEvent.SELECTED) {
			if(e.getItem()==fruit1) {
				sum+=100;
			}else if(e.getItem()==fruit2) {
				sum+=500;
			}else if(e.getItem()==fruit3) {
				sum+=2000;
			}
		}else if(e.getStateChange()==ItemEvent.DESELECTED) {
			if(e.getItem()==fruit1) {
				sum-=100;
			}else if(e.getItem()==fruit2) {
				sum-=500;
			}else if(e.getItem()==fruit3) {
				sum-=2000;
			}
		}
		String point = "���� "+sum+"���Դϴ�";
		lb_reult.setText(point);		
	}
}

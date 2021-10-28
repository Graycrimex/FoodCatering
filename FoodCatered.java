import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;

public class FoodCatered implements ItemListener, ActionListener{
	
	static JFrame f;
	JRadioButton rbtnSenior, rbtnNSenior;
	JCheckBox chkBg, chkCbg, chkECbg;
	double cost;
	String checked;
	
	public FoodCatered(){
		
		
		JFrame frm = new JFrame();
		frm.setSize(300,300);
		frm.setLayout(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		rbtnSenior = new JRadioButton("Senior");
		rbtnSenior.setBounds(150,90,80,20);
		rbtnSenior.addItemListener(this);
		
		rbtnNSenior = new JRadioButton("Not Senior");
		rbtnNSenior.setBounds(30,90,110,20);
		rbtnNSenior.addItemListener(this);
		
		chkCbg = new JCheckBox("Cheeseburger @ 30");
		chkCbg.setBounds(10,70,200,20);
		chkCbg.addItemListener(this);
		
		chkBg = new JCheckBox("Hamburger @ 20");
		chkBg.setBounds(10,10,200,20);
		chkBg.addItemListener(this);
		
		chkECbg = new JCheckBox("Cheeseburger w egg @ 40");
		chkECbg.setBounds(10,40,200,20);
		chkECbg.addItemListener(this);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbtnNSenior);
		bg.add(rbtnSenior);
		
		frm.add(chkBg);
		frm.add(chkCbg);
		frm.add(chkECbg);
		frm.add(rbtnNSenior);
		frm.add(rbtnSenior);
		
		
		
		frm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ce){
		
		cost = 0;
		checked = "";
		
		if(chkBg.isSelected()){
			
			checked += "\nHamburger: 20";
			cost += 20;
			
		}
		if(chkCbg.isSelected()){
			
			checked += "\nCheeseburger: 30";
			cost += 30;
			
		}
		if(chkECbg.isSelected()){
			
			checked += "\nCheeseburger w egg: 40";
			cost += 40;
			
		}
		
		
	}
	
	
	public void itemStateChanged(ItemEvent ie){
		
		AbstractButton ab = (AbstractButton) ie.getSource();
		int state = ie.getStateChange();
		
		if(state == ItemEvent.SELECTED){
			
			if(rbtnSenior.isSelected()){
				cost = cost * 0.20;
				JOptionPane.showMessageDialog(null, checked + "\n-----------" + "\nTotal: " + cost);
			}else if(rbtnNSenior.isSelected()){
				
				JOptionPane.showMessageDialog(null, checked + "\n-----------" + "\nTotal: " + cost);
				
			}
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	public static void main(String [] args){
		
		FoodCatered fc = new FoodCatered();
		
	}
	
}
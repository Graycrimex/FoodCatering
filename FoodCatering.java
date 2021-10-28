import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;



public class FoodCatering implements ItemListener, ActionListener{
	
	JRadioButton rbtnSenior, rbtnJunior;
	JCheckBox chkBurger, chkCBurger, chkCEBurger;
	double cost, discount = 0.20;
	String checked;
	
	public FoodCatering(){
		
		
		JFrame frm = new JFrame();
		frm.setSize(300,300);
		frm.setLayout(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		rbtnSenior = new JRadioButton("Senior");
		rbtnSenior.setBounds(150,90,80,20);
		rbtnSenior.addItemListener(this);
		
		rbtnJunior = new JRadioButton("Not Senior");
		rbtnJunior.setBounds(30,90,110,20);
		rbtnJunior.addItemListener(this);
		
		chkCBurger = new JCheckBox("Cheeseburger @ 30");
		chkCBurger.setBounds(10,70,200,20);
		chkCBurger.addItemListener(this);
		
		chkBurger = new JCheckBox("Hamburger @ 20");
		chkBurger.setBounds(10,10,200,20);
		chkBurger.addItemListener(this);
		
		chkCEBurger = new JCheckBox("Cheeseburger w egg @ 40");
		chkCEBurger.setBounds(10,40,200,20);
		chkCEBurger.addItemListener(this);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbtnJunior);
		bg.add(rbtnSenior);
		
		frm.add(chkBurger);
		frm.add(chkCBurger);
		frm.add(chkCEBurger);
		frm.add(rbtnJunior);
		frm.add(rbtnSenior);
		
		
		
		frm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae){
			
			cost = 0;
			checked = "";
			
			if(chkBurger.isSelected()){
			checked = checked + "\nHamburger: 20";
			cost = cost + 20;
			}
			if(chkCBurger.isSelected()){
			checked = checked + "\nCheeseburger: 30";
			cost = cost + 30;
			}
		
			if(chkCEBurger.isSelected()){
			checked = checked + "\nCheeseburger w egg: 40";
			cost = cost + 40;
			
			
			
			}
		
		
		
		
	}



	public void itemStateChanged(ItemEvent ie){
		
		AbstractButton ab = (AbstractButton) ie.getSource();
		int state = ie.getStateChange();
		

	
		

		if(state == ItemEvent.SELECTED){
		
			
			if(rbtnSenior.isSelected()){
			cost = cost * discount;
			JOptionPane.showMessageDialog(null,checked + "\n-------" + "\nTotal: " + cost);
			
			}else if(rbtnJunior.isSelected()){
			
			JOptionPane.showMessageDialog(null," " + checked + "\n-------" + "\nTotal: " + cost);
			
		}}
		
		
		
		
		
	}

	
	public static void main (String [] args){
		
		FoodCatering fc = new FoodCatering();
		
	}
	
	
	
	
}
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.*;
enum Operation{
	ADD,SUBSTRACT,MULTIPLY,DIVIDE
}
public class Caculator extends JFrame{
private JTextField resultTextField;
private JButton add,substract,multiply,divide,compute;
private JButton numbers[];
private Font font;
private int first=0,second=0,result=0;
Operation o=Operation.ADD;

public Caculator(){
	createComponents();
	setLayout();
	addComponents();
	addBehaviors();
	display();
}
class NumberListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==numbers[1]){
			resultTextField.setText(
					resultTextField.getText().concat("1"));
		}
		if(e.getSource()==numbers[2]){
			resultTextField.setText(
					resultTextField.getText().concat("2"));
		}
		if(e.getSource()==numbers[3]){
			resultTextField.setText(
					resultTextField.getText().concat("3"));
		}
		if(e.getSource()==numbers[4]){
			resultTextField.setText(
					resultTextField.getText().concat("4"));
		}
		if(e.getSource()==numbers[5]){
			resultTextField.setText(
					resultTextField.getText().concat("5"));
		}
		if(e.getSource()==numbers[6]){
			resultTextField.setText(
					resultTextField.getText().concat("6"));
		}
		if(e.getSource()==numbers[7]){
			resultTextField.setText(
					resultTextField.getText().concat("7"));
		}
		if(e.getSource()==numbers[8]){
			resultTextField.setText(
					resultTextField.getText().concat("8"));
		}
		if(e.getSource()==numbers[9]){
			resultTextField.setText(
					resultTextField.getText().concat("9"));
		}
		if(e.getSource()==numbers[0]){
			resultTextField.setText(
					resultTextField.getText().concat("0"));
		}
	}
}
class OperationListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == add){
			first=Integer.parseInt(resultTextField.getText());
			resultTextField.setText("");
			o=Operation.ADD;
		}
		if(e.getSource() == substract){
			first=Integer.parseInt(resultTextField.getText());
			resultTextField.setText("");
			o=Operation.SUBSTRACT;
		}
		if(e.getSource() == multiply){
			first=Integer.parseInt(resultTextField.getText());
			resultTextField.setText("");
			o=Operation.MULTIPLY;
		}
		if(e.getSource() == divide){
			first=Integer.parseInt(resultTextField.getText());
			resultTextField.setText("");
			o=Operation.DIVIDE;
		}
	}
}
class ComputeListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
	second=Integer.parseInt(resultTextField.getText());
		if(o == Operation.ADD){
		 result=first+second;
		}
		if(o==Operation.SUBSTRACT){
			result=first-second;
		}
		if(o == Operation.DIVIDE){
			result=first*second;
		}
		if(o == Operation.MULTIPLY){
			result=first/second;
		}
		resultTextField.setText(""+result);
	}
}
private void addBehaviors(){
	ComputeListener cl=new ComputeListener();
	compute.addActionListener(cl);
	
	OperationListener ol=new OperationListener();
	add.addActionListener(ol);
	substract.addActionListener(ol);
	multiply.addActionListener(ol);
	divide.addActionListener(ol);
	
	NumberListener nl=new NumberListener();
	for(int i=0;i<numbers.length;i++){
		numbers[i].addActionListener(nl);
	}
}
private void display(){
	setSize(600,600);
	setVisible(true);
}
private void addComponents(){
	Container c=getContentPane();
	c.add(resultTextField);
	
	JPanel panel=new JPanel();
	panel.add(add);
	panel.add(substract);
	panel.add(multiply);
	panel.add(divide);
	c.add(panel);
	
	panel=new JPanel();
	panel.add(compute);
	c.add(panel);
	
	JPanel p=new JPanel();
	p.add(numbers[1]);
	p.add(numbers[2]);
	p.add(numbers[3]);
	p.add(numbers[4]);
	c.add(p);
	
	p=new JPanel();
	p.add(numbers[5]);
	p.add(numbers[6]);
	p.add(numbers[7]);
	p.add(numbers[8]);
	c.add(p);
	
	p=new JPanel();
	p.add(numbers[9]);
	p.add(numbers[0]);
	c.add(p);
	
}
private void setLayout(){
	GridLayout gl=new GridLayout(6,1);
	Container c=this.getContentPane();
	c.setLayout(gl);
}
private void createComponents(){
	font =new Font("TimesRoman", Font.PLAIN,36);
	resultTextField=new JTextField(10);
	resultTextField.setFont(font);
	
	add=new JButton("+");
	add.setFont(font);
	substract=new JButton("-");
	substract.setFont(font);
	multiply=new JButton("*");
	multiply.setFont(font);
	divide=new JButton("/");
	divide.setFont(font);
	compute=new JButton("=");
	compute.setFont(font);
	
	numbers=new JButton[10];
	for(int i=0;i<10;i++){
		numbers[i]=new JButton(i+"");
		numbers[i].setFont(font);
	}
}
	public static void main(String[] args) {
		Caculator c=new Caculator();
	}

}

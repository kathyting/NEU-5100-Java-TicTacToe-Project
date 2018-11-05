import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.*;
enum Command{
	ADD,VIEW;
}
public class StudentApp extends JFrame{
private JTextField StuName;
private JTextField StuID;
private JTextField StuGender;
private JButton add,view;
private Font font;
private String s1="";
private int s2=0;
private String s3="";
private StudentManageSys sms;
private JTable studentsTable;
public StudentApp(){
	
	createcomponents();
	sms=new StudentManageSys();
	setLayout();
	addComponents();
	addBehaviors();
	display();
}
private void addBehaviors(){
	cmdOperation co=new cmdOperation();
	add.addActionListener(co);
	view.addActionListener(co);
}
class cmdOperation implements ActionListener{
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == add){
			s1=StuName.getText();
			s2=Integer.parseInt(StuID.getText());
			s3=StuGender.getText();
			Student s=new Student(s1,s2,s3);
	    sms.addStus(s);
			
		}
		if(e.getSource() == view){
			displayView();
		}
		
	}
}
private void addComponents(){
	Container c=getContentPane();

	JPanel panel_name=new JPanel();
	JPanel panel_id=new JPanel();
	JPanel panel_gender=new JPanel();
	panel_name.setBorder(new TitledBorder("Student Name"));
	panel_id.setBorder(new TitledBorder("Student id"));
	panel_gender.setBorder(new TitledBorder("Gender"));
	panel_name.add(StuName);
	panel_id.add(StuID);
	panel_gender.add(StuGender);
	JPanel pan=new JPanel();
	pan.add(panel_name);
	pan.add(panel_id);
	pan.add(panel_gender);
	c.add(pan);
	
	JPanel p=new JPanel();
	p.add(add);
	p.add(view);
	c.add(p );
	
}
private void display(){
	setSize(600,200);
	setVisible(true);
}
private void displayView(){
	StudentsTableModel model=new StudentsTableModel(sms);
	studentsTable = new JTable(model);
	JScrollPane jsp=new JScrollPane(studentsTable);
	
	Container con=getContentPane();
	con.add(jsp);
	setSize(400,400);
	setVisible(true);
}
private void setLayout(){
	
	FlowLayout fl=new FlowLayout();
	Container c=this.getContentPane();
	c.setLayout(fl);

	
	
	
}
private void createcomponents(){
	font=new Font("TimesRoman",Font.PLAIN,28);
	StuName=new JTextField(10);
	StuID=new JTextField(10);
    StuGender=new JTextField(8);
    add=new JButton("ADD");
    add.setFont(font);
    view=new JButton("VIEW");
    view.setFont(font);
	
	
	
}
	public static void main(String[] args) {
		StudentApp sa=new StudentApp();

	}

}

import java.util.Collection;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class StudentsTableModel implements TableModel{
private StudentManageSys stus;
public StudentsTableModel(StudentManageSys stus){
	this.stus=stus;
}
public int getRowCount(){
	return stus.getNumberOfStus();
}
public int getColumnCount(){
	return 3;
}
public String getColumnName(int columnIndex){
	if(columnIndex == 0){
		return "Name";
	}
	if(columnIndex == 1){
		return "ID";
	}
	if(columnIndex == 2){
		return "Gender";
	}
	return null;
}
public Class<?> getColumnClass(int columnIndex) {
	if (columnIndex == 3) {
		return Boolean.class;
	}
	return String.class;
}
public boolean isCellEditable(int rowIndex, int columnIndex) {

	return false;
}
public Object getValueAt(int rowIndex,int columnIndex){
	Collection<Student> s=stus.getStudents();
	int row=-1;
	for(Student student:s){
		row++;
		if(row == rowIndex){
			if(columnIndex == 0){
				return student.getName();
			}
			if(columnIndex == 1){
				return student.getID();
			}
			if(columnIndex == 2){
				return student.getGender();
			}
		}
	}
	return null;
}
@Override
public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
	// TODO Auto-generated method stub

}

@Override
public void addTableModelListener(TableModelListener l) {
	// TODO Auto-generated method stub

}

@Override
public void removeTableModelListener(TableModelListener l) {
	// TODO Auto-generated method stub

}
}

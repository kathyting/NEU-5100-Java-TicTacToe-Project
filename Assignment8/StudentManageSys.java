import java.util.ArrayList;
import java.util.Collection;

public class StudentManageSys {
private Collection<Student> stus=new ArrayList<>();
public Collection<Student> getStudents(){
	return stus;
}
public void addStus(Student s){
	stus.add(s);
}
public int getNumberOfStus(){
	return getStudents().size();
}
}

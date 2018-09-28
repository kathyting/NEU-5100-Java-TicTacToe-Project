import java.util.ArrayList;

public class Course {
	private String name;
	private int numberOfStudent;
	private ArrayList<Student> stus;
	public Course(String name){
		this.name=name;
		numberOfStudent=0;
		stus=new ArrayList<Student>();
}
	public ArrayList<Student> getStudents(){
		return stus;
	}
	public boolean isFull(){
		if(numberOfStudent>=10){
			return true;
		}
		return false;
	}
	public String getCourseName(){
		return name;
	}
	public int getNumberOfRegisteredStus(){
		return numberOfStudent;
	}
	public void registerStudent(Student student){
		if(!isFull()){
			stus.add(student);
			numberOfStudent++;
		}else{
			System.out.println("error--register number should not be more than 10");
		}
		
	}
	

}

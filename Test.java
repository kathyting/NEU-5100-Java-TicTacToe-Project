import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String[] stuNames={"alice","peter","bob","tom","livia","zhangsan","wang","li",
				"zhao","yue"};
		ArrayList<Student> arrs=new ArrayList<>();
		//create 10 student object
		for(int i=0;i<stuNames.length;i++){
			Student stu=new Student(stuNames[i],i+1);
			arrs.add(stu);
		}
		for(int i=0;i<arrs.size();i++){
			System.out.println(arrs.get(i).getName()+"---"+arrs.get(i).getID());
		}
		Course course=new Course("java");
		for(int i=0;i<arrs.size();i++){
			course.registerStudent(arrs.get(i));
		}
		System.out.println("total registered students are "+course.getNumberOfRegisteredStus()+" students");
	    System.out.println("try to register another student jacob(StuNo 11)");
		Student stuNew=new Student("jacob",11);
	   course.registerStudent(stuNew);
	  
	  
	   
	}

}

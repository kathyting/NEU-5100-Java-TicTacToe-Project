enum GENDER{
	female,male;
}
public class Student {
  private String name;
  private int id;
  private String gender;
  
  public Student(String name,int id,String gender){
	  this.name=name;
	  this.id=id;
	  this.gender=gender;
  }
  public String getName(){
	  return name;
  }
  public String getGender(){
	  return gender;
  }
  public int getID(){
	  return id;
  }
}

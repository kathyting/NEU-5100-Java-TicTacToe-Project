
public class Psychiatrist {
	public void examine(Moody mood){
		mood.queryMood();
	}
	public void observe(Moody mood){
		mood.expressFeeling();
	}
  public static void main(String[] args){
	  Moody moody1=new Sad();
	  Moody moody2=new Happy();
	  moody2.queryMood();
	  moody2.expressFeeling();
	  System.out.println(moody2.toString());
	  moody1.queryMood();
	  moody1.expressFeeling();
	  System.out.println(moody1.toString());
  }
}

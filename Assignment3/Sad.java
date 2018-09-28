
public class Sad extends Moody{
 protected String getMood(){
	 return "sad";
 }
 public void expressFeeling(){
	 System.out.println("'wah','boo hoo','weep','sob','weep'");
 }
 public String toString(){
	
	 return "Observation:Subject cries a lot";
 }
 public void queryMood(){
	 System.out.println("How are you feeling today?");
	 System.out.println("I fell sad today");
 }
}

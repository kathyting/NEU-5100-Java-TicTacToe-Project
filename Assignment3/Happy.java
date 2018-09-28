
public class Happy extends Moody {
   protected String getMood(){
	   return "happy";
   }
   public void expressFeeling(){
	   System.out.println("hehehe..hahahah..HAHAHAHAHA!!!");
	   
   }
   public String toString(){
	  
	   return "Observation: Subject laughs a lot";
   }
   public void queryMood(){
	   System.out.println("How are you feeling today?");
	   System.out.println("I feel happy today");
   }

}


public class Cat extends Pet implements Boardable{
private String hairLength;
Date boardStartDate;
Date boardEndDate;
public Cat(String name,String ownerName,String color,String hairLength){
	super(name,ownerName,color);
	this.hairLength=hairLength;
	boardStartDate=new Date();
	boardEndDate=new Date();
}
public String getHairLength(){
	return hairLength;
}
public String toString(){
	return this.getPetName()+" owned by "+this.getOwnerName()+"\n"+
			"Color: "+this.getColor()+"\n"+
						"Sex: "+this.getSex()+"\n"+
			"Hair : "+hairLength;
}
@Override
public void setBoardStart(int month, int day, int year) {
	boardStartDate.setDate(month, day, year);
	
}
@Override
public void setBoardEnd(int month, int day, int year) {
	boardEndDate.setDate(month, day, year);
	
	
}
@Override
public boolean boarding(int month, int day, int year) {
	if(year>=boardStartDate.getYear() && year<=boardEndDate.getYear()){
		if(month>=boardStartDate.getMonth() && month<=boardEndDate.getMonth()){
			if(day>boardStartDate.getDay() && day<boardEndDate.getDay()){
				return true;
			}
		}
	}
	return false;
}
}

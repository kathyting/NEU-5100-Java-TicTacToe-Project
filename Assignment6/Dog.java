
public class Dog extends Pet implements Boardable {
private String size;
Date boardStartDate;
Date boardEndDate;
public Dog(String name,String ownerName,String color,String size){
	super(name,ownerName,color);
	boardStartDate=new Date();
	boardEndDate=new Date();
	this.size=size;
}
public String getSize(){
	return size;
}
public String toString(){
	return this.getPetName()+" owned by "+this.getOwnerName()+"\n"+
			"Color: "+this.getColor()+"\n"+
						"Sex: "+this.getSex()+"\n"+
			"Size : "+size;
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
			if(day>=boardStartDate.getDay() && day<=boardEndDate.getDay()){
				return true;
			}
		}
	}
	return false;
}
}

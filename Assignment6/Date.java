
public class Date {
private int month;
private int day;
private int year;
public Date(){
	
}
public Date(int month,int day,int year){
	if(month>=1 && month <=12){
		this.month=month;
	}
	if(day >=1 && day<=31){
		this.day=day;
	}
	this.year=year;
}
public int getMonth(){
	return month;
}
public int getDay(){
	return day;
}
public int getYear(){
	return year;
}
public void setDate(int month,int day,int year){
	if(month>=1 && month <=12){
		this.month=month;
	}
	if(day >=1 && day<=31){
		this.day=day;
	}
	this.year=year;
}

}

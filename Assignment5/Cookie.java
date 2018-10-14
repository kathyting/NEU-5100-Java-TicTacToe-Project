
public class Cookie extends DessertItem{
private int number;
private double price;
//new Cookie("Oatmeal Raisin Cookies", 4, 399));
public Cookie(String name,int num,double price){
	this.name=name;
	number=num;
	this.price=price;
}
public int getCost(){
	return (int)(number*price/12);
}
public String toString(){
	StringBuilder sb1=new StringBuilder();
	sb1.append(number+"  @ "+DessertShoppe.cent2dollarsAndCents(price)+" /dz."+"\r\n");
	 return sb1.toString()+String.format("%-15s %5s %10.2f\n", name,"",number*price/100);
}
}

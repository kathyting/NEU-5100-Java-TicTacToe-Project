
public class IceCream extends DessertItem{
private double cost;
//new IceCream("Vanilla Ice Cream", 105)
public IceCream(String name,double cost){
	this.name=name;
	this.cost=cost;
}
public int getCost(){
	return (int)(cost);
}
public String toString(){
	//StringBuilder sb1=new StringBuilder();
	//sb1.append(weight+" lbs. @ "+DessertShoppe.cent2dollarsAndCents(price)+" /lb."+"\r\n");
	 return String.format("%-15s %5s %10.2f\n", name,"", cost/100);
}
}

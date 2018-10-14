
public class Candy extends DessertItem{
	private double weight;
	private double price;
//	new Candy("Peanut Butter Fudge", 2.25lbs, 399  /lb)
public Candy(String name,double weight,double price){
  this.name=name;
  this.weight=weight;
  this.price=price;
}
public int getCost(){
	return (int)(weight*price);
}
public String toString(){
	StringBuilder sb1=new StringBuilder();
	sb1.append(weight+" lbs. @ "+DessertShoppe.cent2dollarsAndCents(price)+" /lb."+"\r\n");
	 return sb1.toString()+String.format("%-15s %5s %10.2f\n", name, "", weight*price/100);
}

}

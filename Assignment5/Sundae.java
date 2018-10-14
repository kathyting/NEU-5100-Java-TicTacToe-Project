
public class Sundae extends IceCream{
	String topName;
	double topPrice;
	//new Sundae("Choc. Chip Ice Cream", 145, "Hot Fudge", 50))
	public Sundae(String name,double price,String topName,double topPrice){
		super(name,price);
		this.topName=topName;
		this.topPrice=topPrice;
	}
	public int getCost(){
		return (int)(super.getCost()+topPrice);
	}
	public String toString(){
		return String.format("%-15s\n %-15s %5s %10.2f\n", super.name+" with ",topName,"",(super.getCost()+topPrice)/100);
	}
}

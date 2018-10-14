import java.util.ArrayList;
import java.util.List;

public class Checkout {
 private ArrayList<DessertItem> lists;
  
 public Checkout(){
	 lists=new ArrayList<>();
 }
 public int numberOfItems(){
	 return lists.size();
 }
 public void enterItem(DessertItem item){
	 lists.add(item);
 }
 public void clear(){
	 for(int i=0;i<lists.size();i++){
		 lists.remove(i);
	 }
 }
 public int totalCost(){
	 int sum=0;
	 for(int i=0;i<lists.size();i++){
		 sum+=lists.get(i).getCost();
	 }
	 return sum;
 }
 public int totalTax(){
	 return (int)(totalCost()*DessertShoppe.taxRate);
 }
 public String toString(){
	
  String str2=String.format("            %-15s\n           %15s\n", DessertShoppe.storeName,"----------------------");
  StringBuilder sb=new StringBuilder();
  for(int i=0;i<lists.size();i++){
	  sb.append(lists.get(i).toString());
	
  }
  sb.append("\n");
  sb.append(String.format("%-15s %10s\n", "Tax","."+String.valueOf(totalTax())));
  sb.append(String.format("%-15s %10.2f","Total Cost",(totalCost()+totalTax())/100.0 ));
		return str2+sb.toString();  
 }
}

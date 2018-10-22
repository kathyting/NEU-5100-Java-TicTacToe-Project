import java.util.*;
public class Mreview implements Comparable<Mreview>{
	private String title;
	private ArrayList<Integer> ratings;
public Mreview(){
	this.title="";
	this.ratings=new ArrayList<>();
}
public Mreview(String ttl){
	this.title=ttl;
	this.ratings=new ArrayList<>();
}
public Mreview(String ttl,int firstRating){
	this.title=ttl;
	this.ratings=new ArrayList<>();
	this.ratings.add(firstRating);
}
public void addRating(int r){
	this.ratings.add(r);
}
public double aveRating(){
	int sum=0;
	for(int i=0;i<ratings.size();i++){
		sum+=ratings.get(i);
	}
	return (double)(sum/ratings.size());
}
public int compareTo(Mreview obj){
	return this.title.compareTo(obj.title);
}
public boolean equals(Object obj){
	Mreview o=(Mreview)obj;
	if(this.title.equals(o.title)){
		return true;
	}
	return false;
}
public String getTitle(){
	return title;
}
public int numRatings(){
	return ratings.size();
}
public String toString(){
	return title+", average "+aveRating()+"out of "+numRatings();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mreview test1=new Mreview("Kill Bill");
		test1.addRating(3);
		test1.addRating(4);
		test1.addRating(3);
		
		Mreview test2=new Mreview("Abc");
		test2.addRating(5);
		ArrayList<Mreview> arr=new ArrayList<>();
		arr.add(test1);
		arr.add(test2);
		Collections.sort(arr);
		System.out.println(arr);
	}

}

import java.util.*;
class Interval{
	int start;
	int end;
	public Interval(int start,int end){
		this.start=start;
		this.end=end;
	}
	public String toString(){
		return "["+start+" , "+end+"]";
	}
}
public class Solution {
	private static Comparator<Interval> byAsscending=new Comparator<Interval>(){
		public int compare(Interval v1,Interval v2){
			if(v1.start!=v2.start){
				return v1.start-v2.start;
		}else{
			return v1.end-v2.end;
			}
		}
	};
public static List<Interval> merge(List<Interval> intervals){
	if(intervals.size()<=0){
		return intervals;
	}
	
	Collections.sort(intervals,byAsscending);
//	System.out.println("sort"+intervals);
	for(int i=0;i+1<intervals.size();i++){
		Interval cur=intervals.get(i);
		Interval next=intervals.get(i+1);
		if(cur.end>=next.start){
			cur.end=Math.max(cur.end, next.end);
			intervals.remove(next);
			i--;
		}
	
	}
	return intervals;
	
}

	public static void main(String[] args) {
		Interval v1=new Interval(1,3);
		Interval v2=new Interval(2,4);
		Interval v3=new Interval(5,7);
		Interval v4=new Interval(6,8);
		List<Interval> lists=new ArrayList<>();
		lists.add(v1);lists.add(v2);lists.add(v3);lists.add(v4);
		List<Interval> res=merge(lists);
		System.out.println(res);

	}

}

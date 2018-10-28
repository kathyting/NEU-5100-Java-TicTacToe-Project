
public class MyIndexOutOfBoundException {
private int lowerBound;
private int upperBound;
private int index;

public MyIndexOutOfBoundException(){
	lowerBound=0;
	upperBound=9;
	index=-1;
}
	public static void main(String[] args) {//an array which its values ranges from 0 to 9
		int[] arr=new int[]{0,1,2,3,10,5,6,7,8,9};
		MyIndexOutOfBoundException test=new MyIndexOutOfBoundException();
		test.checkValues(arr);

	}
	public  void checkValues(int[] arr){
	  for(int i=0;i<arr.length;i++){
		 index=arr[i];
		 if(index>=arr[lowerBound] && index<=arr[upperBound]){
			 continue;
		 }else{
			System.out.println( toString());
		 }
	  }
	}
	public String toString(){
		return "Error Message: Index: "+index+",but Lower bound: "+lowerBound+", "+
	"Upper bound: "+upperBound;
	}

}

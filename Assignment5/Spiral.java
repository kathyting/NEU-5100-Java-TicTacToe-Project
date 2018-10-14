import java.util.ArrayList;
import java.util.List;

public class Spiral {

	public static void main(String[] args) {
		int[][] matrix={
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
 List<Integer> res=spiralOrder(matrix);
 System.out.println(res);
	}
public static  List<Integer> spiralOrder(int[][] matrix){
	List<Integer> res=new ArrayList<>();
	if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
		return res;
	}
	int m=matrix.length;
	int n=matrix[0].length;
	int circle=Math.min(m+1, n+1)/2;
	int p=m,q=n;
	for(int c=0;c<circle;c++,q-=2,p-=2){
		for(int col=c;col<c+q;col++){
			res.add(matrix[c][col]);
		}
	
		
		for(int row=c+1;row<c+p;row++){
			res.add(matrix[row][c+q-1]);
		}
		if(p==1 || q==1) break;
		for(int col=c+q-2;col>=c;col--){
			res.add(matrix[c+p-1][col]);
		}
		
		for(int row=c+p-2;row>c;row--){
			res.add(matrix[row][c]);			
		}
	
	}
	return res;
}
}

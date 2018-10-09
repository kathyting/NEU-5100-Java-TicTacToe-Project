import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Assignment4 {
	/*
	 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
	 * s = "leetcode" return 0. 
	 * s = "loveleetcode" return 2.
	 */
	public static int firstUniqChar(String s){
		Map<Character,Integer> map=new HashMap<>();
		char[] chs=s.toCharArray();
		for(int i=0;i<s.length();i++){
			if(!map.containsKey(chs[i])){
				map.put(chs[i], 1);				
			}else{			
				map.put(chs[i], map.get(chs[i])+1);			
			}
		}
		System.out.println(map);
		for(int i=0;i<chs.length;i++){
			if(map.get(chs[i])==1){
				return i;
			}
		}
		return -1;
	}
	/*
     *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     * Input: 38 Output: 2
     * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     */
    public static int addDigits(int n) {
    		if(n<10){
    			return n;
    		}
    	int res=helper(n);
    	if(res>9){
    	return	helper(res);
    	}else{
    		return res;
    	}
    }
    private static int helper(int n){
    	
		int sum=0;
		while(n>0){
			
			int remainder=n%10;
			int quotient=n/10;
			sum=sum+remainder;
			n=quotient;
		}
	return sum;
    }
    /*
     *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *  Input: [0,1,0,3,12] Output: [1,3,12,0,0]
     */
    public static void moveZeroes(int[] nums) {
    		if(nums == null || nums.length ==0){
    			return ;
    		}
    		int i=0,j=0;
    		while(i<nums.length && nums[i] ==0){
    			i++;
    		}
    		for(;j<nums.length && i<nums.length;){
    			nums[j]=nums[i];
    			i++;
    			j++;
    			while(i<nums.length && nums[i]==0){
    				i++;
    			}
    		}
    		for(;j<nums.length;j++){
    			nums[j]=0;
    		}
    		System.out.println(Arrays.toString(nums));
    	
     }
    /*
     * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
     * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.
     */
    private static int lo,maxlen;
	public static String longestPalindrome(String s) {
		int len=s.length();
		if(len<2){
			return s;
		}
		for(int i=0;i<len-1;i++){
			extendPalindrome(s,i,i);
			extendPalindrome(s,i,i+1);		
		}
		return s.substring(lo,maxlen);
    }
	private static void extendPalindrome(String s,int k,int j){
		while(k>=0 && j<=s.length() && s.charAt(k)==s.charAt(j)){
			k--;
			j++;
		}
		
		if(maxlen<j-k-1){
			maxlen=j-k-1;
			lo=k+1;
		}
	}
	
	/*
     * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
     * Given input matrix = [ [1,2,3],
  			                  [4,5,6],
  			                  [7,8,9] ],
     * rotate the input matrix in-place such that it becomes: [  [7,4,1],
  								                                 [8,5,2],
  								  								 [9,6,3] ],
     */
	
	public static int[][] rotate(int[][] matrix) {
		//matrix transpose
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
               swap(matrix,i,j,j,i);
            }
        }
        helperReverse(matrix);
        int[][] res=matrix;
        return res;
    }
    private static void swap(int[][] matrix,int si,int sj,int ei,int ej){
       int tmp=matrix[si][sj];
        matrix[si][sj]=matrix[ei][ej];
        matrix[ei][ej]=tmp;
      
        
        
    }
    private static void helperReverse(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            int start=0,end=matrix[0].length-1;
            while(start<end){
                  swap(matrix,i,start,i,end);
                start++;
                end--;
            }
          
        }
    }
    private static void printArray(int[][] matrix){
    	for(int i=0;i<matrix.length;i++){
    		for(int j=0;j<matrix[0].length;j++){
    			System.out.print(matrix[i][j]+", ");
    		}
    		System.out.println();
    	}
    }
    public static void main(String[] args) {
		//String s="loveleetcode";
      // System.out.println(firstUniqChar(s));
		//System.out.println(addDigits(38));
		//int[] nums={0,1,0,3,12};
		//moveZeroes(nums);
		//System.out.println(longestPalindrome("babad"));
		int[][] matrix = { {1,2,3},
	                  {4,5,6},
	                  {7,8,9}
	                  };
		int[][] res=rotate(matrix);
		printArray(res);
	}
}

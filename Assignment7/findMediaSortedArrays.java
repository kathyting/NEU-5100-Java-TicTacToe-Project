
public class findMediaSortedArrays {
public static double findMedianSotedArrays(int[] nums1,int[] nums2){
	int len=nums1.length+nums2.length;
	if(len %2 == 0){
		return (findKth(nums1,nums2,len/2)+findKth(nums1,nums2,len/2+1))/2.0;
	}else{
		return findKth(nums1,nums2,len/2+1);
	}
}
private static int findKth(int[] A,int[] B,int k){
	if(A == null){
		return B[k-1];
	}
	if(B == null){
		return A[k-1];
	}
	int start=Math.min(A[0], B[0]);
	int end=Math.max(A[A.length-1], B[B.length-1]);
	while(start+1<end){
		int mid=start+(end-start)/2;
		if(helper(A,mid)+helper(B,mid)<k){
			start=mid;
		}else{
			end=mid;
		}
	}
	if(helper(A,start)+helper(B,start)>=k){
		return start;
	}
	return end;
	
}
//find first numer >value,return its index
private static int helper(int[] arr,int value){
	int s=0,e=arr.length-1;
	while(s+1<e){
		int mid=s+(e-s)/2;
		if(arr[mid]<value){
			s=mid;
		}else{
			e=mid;
		}
	}
	if(arr[s]>value){
		return s;
	}
	if(arr[e]>value){
		return e;
	}
	return arr.length;
}
	public static void main(String[] args) {
		int[] nums1={1,2};
		int[] nums2={3,4};
		
     System.out.println(findMedianSotedArrays(nums1,nums2));
	}

}

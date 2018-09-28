
public class reverseStr {

	public static void main(String[] args) {
		String str="  the sky is   blue ";
		String res=reverse(str);
		 System.out.println(res);
	}
	public static String reverse(String s){
		char[] ch=s.toCharArray();
		reverseStr(ch,0,ch.length-1);
	    reverseWords(ch,ch.length);
	    String res=cleanSpaces(ch,ch.length);
	   
	    return res;
	}
	//clean spaces
	public static String cleanSpaces(char[] ch,int len){
		int i=0,j=0;
		while(j<len){
			while(j<len && ch[j]==' ') j++;
			while(j<len && ch[j]!=' ') ch[i++]=ch[j++];
			while(j<len && ch[j]==' ') j++;
			if(j<len){
				ch[i++]=' ';
			}
		}
		return new String(ch).substring(0,i);
	}
	public static void reverseWords(char[] ch,int len){
		int i=0,j=0;
		while(i<len){
			
			while(i<j || i<len &&ch[i]==' ') i++;
			while(j<i || j<len && ch[j]!=' ') j++;
			reverseStr(ch,i,j-1);
		}
	}
	public static void reverseStr(char[] ch,int i,int j){
		while(i<j){
			char c=ch[i];
			ch[i]=ch[j];
			ch[j]=c;
			i++;
			j--;
		}
	}
	

}


public interface Boardable {
	//month range 1-12  ;  day range 1-31
	
public void setBoardStart(int month,int day,int year);
public void setBoardEnd(int month,int day,int year);
public boolean boarding(int month,int day,int year);
}

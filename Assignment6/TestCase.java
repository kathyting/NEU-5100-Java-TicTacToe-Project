
public class TestCase {

	public static void main(String[] args) {
		Pet p1=new Pet("Spot","Mary","Black and White");
		p1.setSex(0);
      // System.out.println(p1.toString());
       Cat c1=new Cat("Tom","Bob","black","short");
       c1.setSex(2);
       //System.out.println(c1.toString());
       Dog d1=new Dog("Spot","Susan","white","medium");
       d1.setSex(2);
       d1.setBoardStart(12, 5, 2018);
       d1.setBoardEnd(12, 27, 2018);
      boolean flag= d1.boarding(12, 6, 2018);
      System.out.println(flag);
     //  System.out.println(d1.toString());
	}

}

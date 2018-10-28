abstract class Tool{
	private int strength;
	protected char type;
	public void setStrength(int val){
		this.strength=val;
	}
	public int getStrength(){
		return strength;
	}
}
class Rock extends Tool{
	
	public Rock(int strength){
		super.setStrength(strength);
		this.type='r';
	}
	public boolean fight(Tool tool){
		int dif=0;
		if(tool.type==('s')){
			dif =getStrength()*2-(tool.getStrength());
		}else if(tool.type ==('p')){
			dif=getStrength()/2-(tool.getStrength());
		}
		if(dif>0){
			return true;
		}
		return false;
	}
	
}
class Paper extends Tool{
	public Paper(int strength){
		super.setStrength(strength);
		this.type='p';
	}
	public boolean fight(Tool tool){
		int dif=0;
		if(tool.type==('r')){
			dif =getStrength()*2-(tool.getStrength());
		}else if(tool.type ==('s')){
			dif=getStrength()/2-(tool.getStrength());
		}
		if(dif>0){
			return true;
		}
		return false;
	}
	
}
class Scissors extends Tool{
	public Scissors(int strength){
		super.setStrength(strength);
		this.type='s';
	}
	public boolean fight(Tool tool){
		int dif=0;
		if(tool.type==('p')){
			dif =getStrength()*2-(tool.getStrength());
		}else if(tool.type ==('r')){
			dif=getStrength()/2-(tool.getStrength());
		}
		if(dif>0){
			return true;
		}
		return false;
	}
}
public class RockPaperScissorsGame {

	public static void main(String[] args) {
		Scissors s=new Scissors(5);
		Paper p=new Paper(7);
		Rock r=new Rock(15);
		System.out.println(s.fight(p)+" , "+p.fight(s));
		System.out.println(p.fight(r)+" , "+r.fight(p));
		System.out.println(r.fight(s)+" , "+s.fight(r));

	}

}

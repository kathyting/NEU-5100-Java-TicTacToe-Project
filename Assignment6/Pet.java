class SEX{
	public static final int MALE=0;
	public static final int FEMALE=1;
	public static final int SPAYED=2;
	public static final int NEUTERED=3;
}
public class Pet {
	private String name;
	private String ownerName;
	private String color;
	
	protected int sex;
	public Pet(String name,String ownerName,String color){
		this.name=name;
		this.ownerName=ownerName;
		this.color=color;
	}
	public String getPetName(){
		return name;
	}
	public String getOwnerName(){
		return ownerName;
	}
	public String getColor(){
		return color;
	}
	public void setSex(int sexid){
		if(sexid>=0 && sexid<4){
		switch(sexid){
		case 0:
			this.sex=SEX.MALE;
			break;
		case 1:
			this.sex=SEX.FEMALE;
			break;
		case 2:
			this.sex=SEX.SPAYED;
			break;
		case 3:
			this.sex=SEX.NEUTERED;
			break;
		
		}
			
		}
		return;
	}
	public String getSex(){
		String sx="";
		switch(sex){
		case 0:
			sx="MALE";
			break;
		case 1:
			sx="FEMALE";
			break;
		case 2:
			sx="SPAYED";
			break;
		case 3:
			sx="NEUTERED";
			break;
		}
		return sx;
	}
	public String toString(){
		return name+" owned by "+ownerName+"\n"+
	"Color: "+color+"\n"+
				"Sex: "+getSex();
	}
}


public class Main {
	public static void main(String[] args) {
		/*
		Ainterface a = new AinterfaceImpl() ;
		a.funcA();
		AObj  aobj = new AObj();
		aobj.funcAA();
	*/
		GameCharacter c = new GameCharacter();
		c.attack();

		c.setWeapon(new Knife());
		c.attack();
		c.setWeapon(new Sword());
		c.attack();
		
		c.setWeapon(new Ax());
		c.attack();
	}
}

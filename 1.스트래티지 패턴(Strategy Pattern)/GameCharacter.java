
public class GameCharacter {
	//추상적인 접근점 (interface)
	private Weapon weapon;
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	public void attack() {
		if(weapon == null) {
			System.out.println("맨손공격");
		}else {
		//델리게이트
		weapon.attack();
		}
	}
	
}

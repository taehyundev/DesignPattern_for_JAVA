
public class GameCharacter {
	//�߻����� ������ (interface)
	private Weapon weapon;
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	public void attack() {
		if(weapon == null) {
			System.out.println("�Ǽհ���");
		}else {
		//��������Ʈ
		weapon.attack();
		}
	}
	
}

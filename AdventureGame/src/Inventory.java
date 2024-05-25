
public class Inventory {
	private boolean water,food,firewood;
	private String weaponName,armourName;
	private int damage,armor;
	
	Inventory () {
		this.water = false;
		this.food = false;
		this.firewood = false;
		this.damage = 0;
		this.armor = 0;
		this.armourName = null;
		this.weaponName = null;
	}

	public boolean isWater() {
		return water;
	}

	public void setWater(boolean water) {
		this.water = water;
	}

	public boolean isFood() {
		return food;
	}

	public void setFood(boolean food) {
		this.food = food;
	}

	public boolean isFirewood() {
		return firewood;
	}

	public void setFirewood(boolean firewood) {
		this.firewood = firewood;
	}

	public String getWeaponName() {
		return weaponName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

	public String getArmourName() {
		return armourName;
	}

	public void setArmourName(String armourName) {
		this.armourName = armourName;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	
	

}

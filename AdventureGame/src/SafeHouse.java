
public class SafeHouse extends NormalLocation {

	SafeHouse(Player player) {
		super(player,"Güvenli Ev");
	}
	
	public boolean getLocation() {
		player.setHealthy(player.getrHealthy());
		System.out.println("Canınız yenilenmiştir !");
		System.out.println("Şu an güvenli evdesiniz !");
		return true;
	}

}

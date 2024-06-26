
public class ToolStore extends NormalLocation {
	
	ToolStore (Player player) {
		super(player,"Mağaza");
		
	}
	
	public boolean getLocation () {
		System.out.println("Para : "+ player.getMoney());
		System.out.println("1. Silahlar");
		System.out.println("2. Zırhlar");
		System.out.println("3. Çıkış");
		int selTool = input.nextInt();
		int selItemID;
		switch(selTool) {
		case 1 : 
			selItemID =  weaponMenu();
			buyWeapon(selItemID);
			break;
		case 2 :
			selItemID = armorMenu ();
			buyArmor(selItemID);
			break;
		default :
			System.out.println("Çıkış yapılmıştır");
			
			break;
			
		}
		
		return true;
	}
	
	public int armorMenu () {
		System.out.println("1. Hafif\t  < Para : 15 - Hasar : 1 >");
		System.out.println("2. Orta \t  < Para : 25 - Hasar : 3 >");
		System.out.println("3. Ağır \t  < Para : 40 - Hasar : 5 >");
		System.out.println("4. Çıkış yap");
		int selArmorID = input.nextInt();
		return selArmorID;
	}
	
	public void buyArmor(int itemID) {
		int avoid = 0, price = 0;
		String avoidName = null;
		
		switch(itemID) {
		case 1 : 
			avoid = 1;
			avoidName = "Hafif";
			price = 15;
			break;
		case 2 :
			avoid = 3;
			avoidName = "Orta";
			price = 25;
			break;
		case 3 :
			avoid = 5;
			avoidName = "Ağır";
			price = 40;
			break;	
		case 4 : 
			System.out.println("Çıkış yapılıyor !");
			break;
		default : 
			System.out.println("Geçersiz işlem !");
			break;
		}
		
		if(price > 0) {
			if(player.getMoney() >= price ) {
				player.getInv().setArmor(avoid);
				player.getInv().setArmourName(avoidName);
				player.setMoney(player.getMoney()-price);
				System.out.println(avoidName +" satın alınmştır , Engellenen Hasar : "+player.getInv().getArmor() );
				System.out.println("Kalan para : "+player.getMoney());
				
				}else {
					System.out.println("Para Yetersiz !");
				}
		}
	}
	
	public int weaponMenu () {
		System.out.println("1. Tabanca\t < Para : 25 - Hasar : 2 >");
		System.out.println("2. Kılıç  \t < Para : 35 - Hasar : 3 >");
		System.out.println("3. Tüfek  \t < Para : 45 - Hasar : 7 >");
		System.out.println("4. Çıkış yap");
		int selWeaponID = input.nextInt();
		return selWeaponID;
	}

	public void buyWeapon (int itemID) {
		int damage = 0, price = 0;
		String weaponName = null;
		
		switch(itemID) {
		case 1 : 
			damage = 2;
			weaponName = "Tabanca";
			price = 25;
			break;
		case 2 :
			damage = 3;
			weaponName = "Kılıç";
			price = 35;
			break;
		case 3 :
			damage = 7;
			weaponName = "Tüfek";
			price = 45;
			break;	
		case 4 : 
			System.out.println("Çıkış yapılıyor !");
			break;
		default : 
			System.out.println("Geçersiz işlem !");
			break;
		}
		
		if(price > 0) {
			if(player.getMoney() >= price ) {
				player.getInv().setDamage(damage);
				player.getInv().setWeaponName(weaponName);
				player.setMoney(player.getMoney()-price);
				System.out.println(weaponName +" satın alınmştır , Önceki Hasar : "+player.getDamage() +" , Yeni Hasarınız : "
						+ player.getTotalDamage());
				System.out.println("Kalan para : "+player.getMoney());
				
				}else {
					System.out.println("Para Yetersiz !");
				}
		}
		
	}
}

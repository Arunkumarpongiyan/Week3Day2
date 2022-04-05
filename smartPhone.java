package Week3Day2;

public class smartPhone extends androidPhone {
	public void connectWhatsapp() {
		System.out.println("Watsapp connected");
		
	}

	public static void main(String[] args) {
		smartPhone obj=new smartPhone();
		obj.sendmessage();
		obj.makecall();
		obj.savecontact();
		obj.takevideo();
		obj.connectWhatsapp();

	}

}

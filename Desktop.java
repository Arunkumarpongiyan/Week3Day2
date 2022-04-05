package Week3Day2;

public class Desktop implements Hardware,Software {
	
	public void desktopModels() {
		System.out.println("Desktop Class : Models of Desktop");
		
	}	

	public void softwareResources() {
		System.out.println("Software Interface : List of Software");
		
	}

	public void hardwareResources() {
		System.out.println("Hardware Interface : List of Hardware");
		
	}
	
	public static void main(String[] args) {
		
		Desktop Parts=new Desktop();
		Parts.desktopModels();
		Parts.softwareResources();
		Parts.hardwareResources();	
		

	}

}

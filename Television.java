package Week3Day2;

public class Television extends SamsungTV{

	public void tv() {
		System.out.println("Televison Tv Running");
		
	}
	
	public static void main(String[] args) {
		Television telecasting=new Television();
		telecasting.LED();
		telecasting.QLED();
		telecasting.LCD();
		telecasting.Remote();
		telecasting.tv();
		

	}

}

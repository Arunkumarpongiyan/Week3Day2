package Week3Day2;

public class Automation extends MultipleLangauge implements Language, TestTool{
	

	@Override
	public void ruby() {
		System.out.println("AbstractClass implemented method  : Ruby Language");
		
	}

	public void Selenium() {
		System.out.println("Interface TestTool : Selenium Language");
		
	}

	public void Java() {
		System.out.println("Interface Language : Java Language");
		
	}
	
public static void main(String[] args) {
	
	Automation Languages=new Automation();
	Languages.ruby();
	Languages.Selenium();
	Languages.Java();
	Languages.python();
		

	}
	
	

}

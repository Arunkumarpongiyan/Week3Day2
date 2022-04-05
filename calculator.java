package Week3Day2;

public class calculator {
	
	public void add(int a, int b) {
		System.out.println(a+b);
		
	}
	public void add(int b, int c, int d) {
		System.out.println(b+c+d);
		
	}
	public void multiply(int a, int b) {
		System.out.println(a*b);
	}
	public void multiply(int a, double b) {
		System.out.println(a*b);
	}
	
	public void sub(double a, double b) {
		System.out.println(a-b);
		
	}
	public void sub(int a, int b) {
		System.out.println(a-b);
		
	}
		
	public void div(int a, int b) {
		System.out.println(a/b);
	}
	public void div(double a, double b) {
		System.out.println(a/b);
	}

	
	
	public static void main(String[] args) {
	
		calculator object = new calculator();
		object.add(5, 6);
		object.add(4, 5, 6);
		object.multiply(2, 4);
		object.multiply(6, 7);
		object.sub(4, 5);
		object.sub(5, 6);
		object.div(4, 5);
		object.div(5, 6);
	}

}


public class Calculator {

	public int add(int x, int y) {
		int j = x+y;
		System.out.println(j);
		return j;
	}
	
	public int sub(int x, int y) {
		
		return x-y;
	}
	
	public int mul(int x, int y) {
		
		return x*y;
	}
	
	public int div(int x, int y) {
		
		return x/y;
		System.out.println("THis prints");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.add(4, 8);
		int j = c.sub(10, 5);
		System.out.println(j);
	}

}

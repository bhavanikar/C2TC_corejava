package staticblock;

public class demo {
	static int a;
	static int b;
	static int c;
	static {
		a=10;
		b=20;
		c=a+b;
		System.out.println("HI WELCOME TO CLASS");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("THE VALUE OF a="+a);
		System.out.println("THE VALUE OF b="+b);
		System.out.println("THE VALUE OF c="+c);
	}

}

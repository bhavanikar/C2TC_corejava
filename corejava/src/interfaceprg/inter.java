package interfaceprg;
interface myinterface{
	public void method1();
	public void method2();
}

 class inter implements myinterface
 {
	 public void method1()
	 {
		 System.out.println("implementation of method1");
	 }
	 public void method2()
	 {
		 System.out.println("implementation of method2"); 
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       inter obj=new inter();
       obj.method1();
	}

}

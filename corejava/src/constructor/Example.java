package constructor;

 class Example {
	 Example()
	 {
		 System.out.println("default constructor");
	 }
	 Example(int i,int j)
	 {
		 System.out.println("constructor with two parameters="+i+j);
	 }
	 Example(int i , int j,int k)
	 {
		 System.out.println(" constructor with three parameters="+i +j +k);
	 }
	 Example(int i,String name)
	 {
		 System.out.println(" constructor with i and string ="+i );
	 }
	public static void main(String args[]) {
		// TODO Auto-generated method stub
      Example obj=new Example();
      Example obj2=new Example(1,2);
      Example obj3=new Example(10,20,30);
      Example obj4=new Example(40,"Bhavani");
      
      
	}

}

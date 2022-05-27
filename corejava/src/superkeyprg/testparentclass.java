package superkeyprg;

class TestparentClass
{
   int var=100;
}
class TestchildClass extends TestparentClass
{
	int var=50;
	void display()
	{
		System.out.println("the var value of child:"+var);
		System.out.println("the var value of child:"+super.var);
	}	
}
class main
{	
	public static void main (String[] args)
	{
		// TODO Auto-generated method stub
       TestchildClass tcc=new TestchildClass();
       tcc.display();
	}

}

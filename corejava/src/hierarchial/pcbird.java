package hierarchial;

 class pcbird
 { void fly()
	 {
	  System.out.println(" ia am a bird");
	 }
 }
class parrot extends pcbird
{
	void whatcolourami()
	{
		System.out.println("i am green!");
	}
}
class crow extends pcbird
{
	void whatcolourami()
	{
		System.out.println("i am black!");
	}
}
class main
{
	public static void main(String args[])
	{
		// TODO Auto-generated method stub
      parrot par=new parrot();
      crow cro=new crow();
      par.whatcolourami();
      par.fly();
      cro.whatcolourami();
      cro.fly();
	}

}

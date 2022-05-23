package corejava_package;

public class vehicle_prg {
	int year_of_pur;
	String make;
	int model;
	double cost;
	public void disp1()
	{
		System.out.println("year of purchase:"+2001);
		System.out.println("make:"+"suzuki");
		
	}
    public void disp2()
    {
    	System.out.println("model:"+2000);
    	System.out.println("cost:"+30000.50);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        vehicle_prg obj=new vehicle_prg();
        obj.disp1();
        obj.disp2();
	}

}

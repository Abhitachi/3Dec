package oop;

public class Dog1 {
	
	 public void speak()
	    {
	        System.out.println("woof!");
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
	        Dog1 d = new Dog1();
	        d.speak();
	        Beagle b = new Beagle();
	        b.speak();
	    }
	}

}

class Beagle extends Dog1
{
    public void speak()
    {
        System.out.println("arf arf");
    }
}

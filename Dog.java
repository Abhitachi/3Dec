package oop;

public class Dog {
	
	  private String name;

	    public Dog(String name)
	    {
	        this.name = name;
	    }

	    public boolean equals(Object other)
	    {
	    	 Dog d = (Dog) other;
	         return (this.name==d.name);
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Dog d1 = new Dog("Rufus");
	        Dog d2 = new Dog("Sally");
	        Dog d3 = new Dog("Rufus");
	        Dog d4 = d3;
	        System.out.println(d1.equals(d2));
	        System.out.println(d2.equals(d3));
	        System.out.println(d1.equals(d3));
	        System.out.println(d3.equals(d4));
	}

}

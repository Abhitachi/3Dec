package oop;

public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBook new_novel=new MyBook(); 
		new_novel.setTitle("A tale of two cities");
		System.out.println("The title is: "+new_novel.getTitle());
	}



}
abstract class Books
{
    String title;
    abstract void setTitle(String s);
   
}
class MyBook extends Books
{
	private String title;

	@Override
	void setTitle(String s)
	{
		this.title=s;
	}
	 String getTitle()
	    {
	        return title;
	    }
	
}
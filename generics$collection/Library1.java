package generics$collection;

public class Library1
{
   <e> void printdetail( e a[] )
   {
	   for(e fetch : a)
		   System.out.println(fetch);
   }
   public static void main(String[] args) {
	  String[] books_name= new String[]{"C in Depth","never die","lucky mind"};
	  Integer[] books_price=new Integer[] {124,456,678};
	 String[] author_name=new String[]{"henry willams","docey","well wishes"};
	  String[] published_date=new String[]{"13/4/01","1/2/99","23/5/80"};   
	 Library1 lb1=new Library1();
	 System.out.println("books name are :");
	 lb1.printdetail(books_name);
	 System.out.println("books price are :");
	 lb1.printdetail(books_price);
	 System.out.println("books author name are :");
	 lb1.printdetail(author_name);
	 System.out.println("books published date :");
	 lb1.printdetail(published_date);
}


}

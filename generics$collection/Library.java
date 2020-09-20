package generics$collection;

public class Library
{
	String books_name[];
	int books_price[];
	String books_author[];
	String books_published[];
	
	public Library(String[] books_name, int[] books_price, String[] books_author, String[] books_published) {
		super();
		this.books_name = books_name;
		this.books_price = books_price;
		this.books_author = books_author;
		this.books_published = books_published;
	}
	void detail()
	{
		System.out.println("books-name are : ");
		for(String name : books_name)
			System.out.println(name);
		System.out.println("books-price are : ");
		for(int price : books_price)
			System.out.println(price);
		System.out.println("books-author are : ");
		for(String author : books_author)
			System.out.println(author);
		System.out.println("books-published in : ");
		for(String publish : books_published)
			System.out.println(publish);
		
	}
	public static void main(String[] args) {
		
		Library lb=new Library(new String[]{"C in Depth","never die","lucky mind"},new int[] {124,456,678},new String[]{"henry willams","docey","well wishes"}, new String[]{"13/4/01","1/2/99","23/5/80"});
		lb.detail();
	}
	

}

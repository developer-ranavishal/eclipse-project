package generics$collection;

public class Genricclass1 <p>
{
	p i;
	p j;
   public Genricclass1(p i, p j) {
		super();
		this.i = i;
		this.j = j;
	}
   void display()
   {
	   System.out.println("sum is ");
	   System.out.println("i  is "+i);
	   System.out.println("j is "+j);     
   }
public static void main(String[] args) {
	
	
	Genricclass1 ge=new Genricclass1(new Character('h'),new Float(45.6));
	Genricclass1<Integer> g=new Genricclass1<Integer>(12,35);
	ge.display();
	g.display();
	
	   
}
}

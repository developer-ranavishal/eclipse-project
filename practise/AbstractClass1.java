package practise;

public class AbstractClass1 {

}
abstract class Painting
{
	private int color_used;
	private String[] s;
	abstract void paintingtype();
	void setmaterial(int color_used,String[] s)
	{
		this.color_used=color_used;
		this.s= s;
	}
	
}

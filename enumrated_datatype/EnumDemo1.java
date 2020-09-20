package enumrated_datatype;

public class EnumDemo1 
{
	enum Car_rates
	{
		TWOLAKH,FIVELAKH,SEVENLAKH,TWENTYLAKH;
		
		
	}
	public static void main(String[] args) {
		
		System.out.println();
		switch (Car_rates.SEVENLAKH) {
		case TWOLAKH :
		{
			System.out.println("you can afford old bolaero");
			break;
			
			
		}
		case FIVELAKH :
			System.out.println("you can afford old scorpio");
			break;
		case SEVENLAKH :
			System.out.println("you can afford old ciaz ");
			break;
		case TWENTYLAKH :
			System.out.println("you can afford BUKATI");
			break;
		default:
			System.out.println("you can't afford anything");
			break;
		}
		
	}

}

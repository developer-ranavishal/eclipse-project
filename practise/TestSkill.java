package practise;

public class TestSkill {

	private void printMatrix(String[][] array,int Row,int Column)
	{ 
		
		for (int i = 0; i < Row; i++) {
			
			for (int j = 0; j < Column; j++) {
				
				System.out.print(array[i][j]+"  ");
					
			}
			System.out.println("");
		}
	}
	
 public static void main(String[] args) {

String array[][]= {{"Vishal rana","Tanvi rana"},{"Himanshu rana","Pooja rana"},{"hello","bye"}};
int Row=3;
int Column=2; 
new TestSkill().printMatrix(array, Row, Column);;
	 
}
}

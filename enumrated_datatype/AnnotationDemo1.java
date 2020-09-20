package enumrated_datatype;

public class AnnotationDemo1 
{

}

@interface Fruit
{
	int a() default 1;
	
}
@Fruit()
class Apple
{
	
	}

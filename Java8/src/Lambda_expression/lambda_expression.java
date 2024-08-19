//package Java8_Intro;
package Lambda_expression;

@FunctionalInterface
interface A{
	public void name();
//	public void name(int a);
//	public int name(int a,String name);
	
}
public class lambda_expression {
public static void main(String[] args) {

	A obj1=()->{System.out.println("Hello");};                        //First Step
	obj1.name();
	
//	A obj1=()->System.out.println("Hello") ;                          Second Step

//	A obj1=(int a)->{System.out.println("Return Value");return a+a;};  Third Step
	
//	A obj1=a->{System.out.println("Return Value");return a+a;};       Fouth Step
	
//  A obj1=a->a+a;                                   
		
//	System.out.println(obj1.name(10));
	

	
	
}
}

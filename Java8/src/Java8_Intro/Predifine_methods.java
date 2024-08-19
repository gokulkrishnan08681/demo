package Java8_Intro;

import java.util.function.Predicate;


@FunctionalInterface
interface a{
	void m1();
	
	static void m2() {
		System.out.println("Hello");
	}
}

public class Predifine_methods {
public static void main(String[] args) {
	
Predicate<Integer> pre1=(no)->no>60;
System.out.println(pre1.test(75));

	
}
}

class A {
int a = 100;
	public A() {
		System.out.println("in the constructor of class A: ");
		System.out.println("a = "+a);
		a = 333;
		System.out.println("a = "+a);
	}
	public void setA( int value) {
		a = value;
	}
	public int getA() {
		return a;
	}
}

class B extends A {
double b = 123.45;
public B() {
System.out.println("-----in the constructor of class B: ");
System.out.println("b = "+b);
b = 3.14159;
System.out.println("b = "+b);
}
	public void setB( double value) {
	b = value;
}
	public double getB() {
	return b;
	}
}


public class OOPExercise {

	public static void main(String[] args) {

		//A objA = new A();
		System.out.println("before object creation");
		B objB = new B();
		System.out.println("in main(): ");
		//System.out.println("objA.a = "+objA.getA());
		System.out.println("objB.b = "+objB.getB());
		//objA.setA (222);
		objB.setB (333.33);
		//System.out.println("objA.a = "+objA.getA());
		System.out.println("objB.b = "+objB.getB());	
	}

}


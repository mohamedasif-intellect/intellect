package JunitTestCases;

public class Helpline {
public void handle(Tiger t) {
	System.out.println("ill take care of tiger...");
}
public void handle(lion l) {
	System.out.println("ill take care of lion...");
}
public void handle(monkey m) {
	System.out.println("ill take care of monkey...");
}

public static void main(String[] args) {
	Helpline h =new Helpline();
	monkey result=new monkey();
	new connect().test(result);
	
}
}
class connect{
	public void test(takecare i) {
		i.test();
	}
}
abstract class takecare{
	abstract void test();
}
class Tiger extends takecare{
	void test() {new Helpline().handle(this);}
}
class lion extends takecare{
	void test() {new Helpline().handle(this);}
}
class monkey extends takecare{
	void test() {new Helpline().handle(this);}
}
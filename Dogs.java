package JunitTestCases;



public class Dogs {

}
abstract class habit{
	abstract void call();
}
class barking extends habit{
	void call() {
		System.out.println("barking dog....");
	}
}
class Eating extends habit{
	void call() {
		System.out.println(" dog eating....");
	}
}
class running extends habit{
	void call() {
		System.out.println("dog running...");
	}
}

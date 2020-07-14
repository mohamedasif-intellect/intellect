
public class BadFan {
	

}
abstract class Fan2{
	abstract	void test() ;
}
class a extends Fan2{
public	void test(){
		System.out.println(" the speed oF Fan is low...");
	}
	
}
class b extends Fan2{
	public void test() {
		System.out.println(" the speed oF Fan is medium");
	}
	
}
class c extends Fan2{
	public void test() {
		System.out.println(" the speed oF Fan is high ");
	}

}

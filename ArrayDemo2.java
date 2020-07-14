package JunitTestCases;

public class ArrayDemo2 {
ClassRoom myclassroom[]=new ClassRoom[5];
public ArrayDemo2() {
	for(int i=0;i<myclassroom.length;i++) {
		myclassroom[i]=new ClassRoom("currently not assigned...");
	}
}
public static void main(String[] args) {
	ArrayDemo2 obj=new ArrayDemo2();
	System.out.println(obj.myclassroom[2].subject);
}
class ClassRoom{
	String subject;
public ClassRoom(String subject) {
	this.subject=subject;
}
}
}

package FirstPack;
interface Person{
	public void getRole();
}
interface Student extends Person{
	
}
class Teacher implements Person{
	public void getRole() {
		System.out.println("teacher");
	}
}
class ClassRoom extends Teacher implements Student{
	public void getRole() {
		System.out.println("Classroom teaching");
	}
}
public class DiamondProblem {
ClassRoom cr=new ClassRoom();
}

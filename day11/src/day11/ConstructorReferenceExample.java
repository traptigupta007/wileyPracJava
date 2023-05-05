package day11;
interface GetInfo{
	Info getMsg(String str);
}
class Info{
	Info(String msg){
		System.out.println(msg);
	}
}
public class ConstructorReferenceExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		GetInfo info = Info::new;
		info.getMsg("helllo");
	}

}

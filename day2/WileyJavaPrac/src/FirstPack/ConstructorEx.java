package FirstPack;

public class ConstructorEx {
ConstructorEx(int a,int b){
		
		System.out.println("2 args constructor:-"+(a+b));
	}
ConstructorEx(float a,int b){
	
	System.out.println("Float args constructor:-"+(a+b));
}
	ConstructorEx(){
		
		System.out.println("No args constructor");
	}
	public void add() {
		
	}
	public static void main(String[] args) {
		ConstructorEx obj=new ConstructorEx();
		ConstructorEx objPara=new ConstructorEx(8,9);
		ConstructorEx objPara1=new ConstructorEx(8F,9);
	}
}

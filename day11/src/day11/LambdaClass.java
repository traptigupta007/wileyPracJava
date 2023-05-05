package day11;

public class LambdaClass {
	static String printThing(Printable thing) {
		return thing.print("gupta");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product myProd=new Product();
//		myProd.print();
//		printThing(myProd);
//		printThing(()-> {
//					
//					System.out.println("lambda example");
//				}
//				);
//		Printable lambdaPrinciple=()->System.out.println("lambda example");;
//		Printable lambdaPrinciple=(s)->System.out.println(s+" lambda example");;
		Printable lambdaPrinciple=(s)->{
			System.out.println(s+" lambda example ");
		return "hello" ; 
		};
		System.out.println(printThing(lambdaPrinciple));
	}

}

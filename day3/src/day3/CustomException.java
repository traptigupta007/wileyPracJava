package day3;
class AgeNotValid extends Exception{
	

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "this age is not valid";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "this age is not apllicable";
	}

	AgeNotValid(String msg){
		super(msg);
	}
}
public class CustomException {
	public static void getAge(int age) throws Exception{
		if(age>18) {
			try {
			throw new AgeNotValid("age not valid");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println(e.toString());
				e.printStackTrace();
			}
		}
		else {
			System.out.println("age not valid");
		}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		getAge(90);
	}

}

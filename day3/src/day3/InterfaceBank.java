package day3;
interface Bank{
	void account();
}
interface Bank1{
	void account();
}
interface ATM extends Bank,Bank1{
	void insertCard();
	void selectOption();
	void enterPassword();
}
interface AA{
	void m1();
}
abstract class NewATM  implements ATM,AA{
	public void account() {}
	public void m1() {}
}
public class InterfaceBank extends NewATM {
public void insertCard() {
	System.out.println("Insert card");
}
public void selectOption() {
	System.out.println("select opiton");
}
@Override
public void enterPassword() {
	System.out.println("enterPassword");
	// TODO Auto-generated method stub
	
}
}

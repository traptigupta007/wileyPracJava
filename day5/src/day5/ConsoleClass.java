package day5;
import java.io.*;
public class ConsoleClass {
public static void main(String[] args) {
	Console console=System.console();
	if(console==null) {
		System.out.println("console not available");
	System.exit(1);}
	String name=console.readLine("your name");
	char[] password=console.readPassword("your password");
	console.printf("hello %s",name);
	console.printf("your password",new String(password));
}
}

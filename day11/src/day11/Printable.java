package day11;



@FunctionalInterface
public interface Printable {
//void print(String prefix, String suffix);
String print(String prefix);
default void sayHi() {
	
}
public static void sayOk() {
	
}
}

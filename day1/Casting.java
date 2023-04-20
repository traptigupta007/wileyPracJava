public class Casting {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myDouble);
        int myInt2 = (int) myDouble;
        System.out.println(myInt2);
        char myChar = 'a';
        myChar++;
        System.out.println(myChar);
        String s1 = "9";
        int strToInt = Integer.parseInt(s1);
        System.out.println(strToInt);
    }
}

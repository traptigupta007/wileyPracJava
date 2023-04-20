import java.util.*;

public class CartAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ar = new ArrayList<>();
        System.out.println("Enter number of items in cart");
        int n = sc.nextInt();
        System.out.println("Enter cart item costs");
        for (int i = 0; i < n; i++)
            ar.add(sc.nextInt());
        int totVal = calcVal(ar);
        System.out.println("Total cart value:" + totVal);
        float dis = calcDis(totVal);
        System.out.println("Discount:" + dis);
        System.out.println("Balance:" + (totVal - dis));
    }

    static int calcVal(List<Integer> ar) {
        int val = 0;
        for (int i : ar)
            val += i;
        return val;
    }

    static float calcDis(int val) {
        if (val < 10000)
            return 0F;
        else
            return (float) val / 10.0F;
    }
}

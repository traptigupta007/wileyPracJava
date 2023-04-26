package day5;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Currency usd=Currency.getInstance("USD");
		NumberFormat format=NumberFormat.getCurrencyInstance(Locale.US);
		String formattedVal = format.format(7.9);
		System.out.println(formattedVal);
		NumberFormat format1=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
		String formattedVal1 = format1.format(7.9);
		System.out.println(formattedVal1);
		double price=2000.97;
		Locale local=new Locale("en","US");
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(local);
		String finalPrice=currencyFormatter.format(price);
		System.out.println(finalPrice);
		DecimalFormat decimalFormatter = new DecimalFormat("#,##0.00");
		decimalFormatter.setPositivePrefix("$");
		String resVal=decimalFormatter.format(price);
		System.out.println(resVal);
		Currency cur=Currency.getInstance("USD");
		String symbol=cur.getSymbol();
		String code=cur.getCurrencyCode();
		System.out.println(symbol);
		System.out.println(code);
	}

}

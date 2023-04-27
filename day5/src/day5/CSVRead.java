package day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVRead {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new FileReader("F:\\wileyPrac\\javaProg\\product.csv")); 
	String i="";
	String[] header=br.readLine().split(",");
	
		List<Product> ar=new ArrayList<>();
	while((i=br.readLine())!=null)
	{
//		System.out.println(i);
		String[] cur=i.split(",");
		Product curProd=new Product();
		curProd.setProduct_name(cur[0]);
		curProd.setProduct_price(Integer.parseInt(cur[1]));
		ar.add(curProd);
	}
	int j=0;
	for(Product product:ar)
	{
		System.out.print(header[j]+" : "+product.getProduct_name());
		j++;
		System.out.println("\t"+ header[j]+" : "+product.getProduct_price());
		j=0;
	}
	
}
}

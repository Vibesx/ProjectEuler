package Problem13;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import util.ReadFromFile;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> input = new ArrayList<String>();
		BigInteger sum = new BigInteger("123");
		try {
			 input = ReadFromFile.readStringAsList("src/Resources/problem13.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(String s : input) {
			sum = sum.add(new BigInteger(s));
		}
		System.out.println(sum.toString().substring(0, 10));
	}
	
}

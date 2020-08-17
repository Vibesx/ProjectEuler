package TestStuff;

import util.MiscUtils;

import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
		int a = 2;
		int b = 5;

		MiscUtils.switchPlaces(a, b);

		System.out.println(a);
	}

	
}


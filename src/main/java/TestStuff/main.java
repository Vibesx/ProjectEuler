package main.java.TestStuff;

import main.java.util.ReadFromFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main {

	public static void main(String[] args) throws IOException {
		List<String> names = ReadFromFile.readListOfStringsAsList("src/Resources/p022_names.txt");
		System.out.println(names.get(10));
	}

	
}


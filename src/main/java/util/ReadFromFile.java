package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class ReadFromFile {

	public static String readString(String path) throws IOException {
		Stream<String> lines = Files.lines(Paths.get(path));
		StringBuilder result = new StringBuilder();
		lines.forEach(s -> result.append(s));
		lines.close();
		return result.toString();
	}
	
	public static String readMatrixString(String path) throws IOException {
		Stream<String> lines = Files.lines(Paths.get(path));
		StringBuilder sb = new StringBuilder();
		lines.forEach(s -> sb.append(s).append(" "));
		lines.close();
		String result = removeLastChar(sb.toString());
		return result;
	}
	
	private static String removeLastChar(String string) {
		return string.substring(0, string.length()-1);
	}

	public static List<String> readStringAsList(String path) throws IOException {
		Stream<String> lines = Files.lines(Paths.get(path));
		List<String> result = new ArrayList<String>();
		lines.forEach(s -> result.add(s));
		lines.close();
		return result;
	}

	public static List<String> readListOfStringsAsList(String path) throws IOException {
		Stream<String> lines = Files.lines(Paths.get(path));
		List<String> result = new ArrayList<>();
		lines.forEach(s -> result.addAll(readLineSeparatedByComma(s)));
		lines.close();
		return result;
	}

	private static Collection<? extends String> readLineSeparatedByComma(String s) {
		return Arrays.asList(s.split(","));
	}
}

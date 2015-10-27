package TestStuff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main {

	public static void main(String[] args) {
		/*List<A> listA = new ArrayList<>();
		List<A> listB = new ArrayList<>();
		listA.add(new A("ZAna"));
		listA.add(new A("ZMaria"));
		listA.add(new A("ZIon"));
		listA.add(new A("ZAVasile"));
		listB.add(new A("ZAna"));
		listB.add(new A("ZMaria"));
		listB.add(new A("ZIon"));
		listB.add(new A("ZAVasile"));
		//System.out.println(listA);
		
		Collections.sort(listA, new Comparator<A>() {

			@Override
			public int compare(A o1, A o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
			
		});
		//listA.forEach(a -> System.out.println(a));
		System.out.println(listA.equals(listB));*/
		List<String> listA = new ArrayList<>();
		List<String> listB = new ArrayList<>();
		listA.add("a");
		listB.add("a");
		System.out.println(listA.equals(listB));
	}

	
}


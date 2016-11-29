import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Exercise 1
// Create intersection and union for Lists.
// The methods should support ArrayLists, LinkedLists etc.
// (Generics are coming).

public class ds-ex1 {

    public static <T> List<T> union(List<T> list1, List<T> list2) {
        Set<T> set = new HashSet<T>();

        set.addAll(list1);
        set.addAll(list2);

        return new ArrayList<T>(set);
    }

    public static <T> List<T> intersection(List<T> list1, List<T> list2) {
        List<T> list = new ArrayList<T>(); // list which is going to contain the common items

        for (T t : list1) { // iterates list1
            if(list2.contains(t)) { // checks if current list1 item is contained within list 2
                list.add(t); // adds that item to a third list
            }
        }

        return list; // returns the list with the common items
    }

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(5);
		list1.add(7);
		list1.add(9);
		list1.add(20);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(5);
		list2.add(10);
		list2.add(11);
		list2.add(20);

		List<Integer> unionResult = intersection(list1, list2);

		for(int i = 0; i < unionResult.size(); i++) {
			System.out.println(unionResult.get(i));
		}

	}

}

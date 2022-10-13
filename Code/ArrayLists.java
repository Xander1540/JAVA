import java.util.*;

public class ArrayLists {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();

		Scanner input = new Scanner(System.in);

		list.add(67);
		list.add(67);
		list.add(70);
		list.add(67);
		list.add(67);
		list.add(07);
		list.add(67);
		list.add(67);
		list.add(67);
		list.add(67);
		list.add(67);
		list.add(67);
		list.add(67);
		list.add(67);
		list.add(67);
		list.add(67);
		System.out.println(list.contains(7));

		list.set(0, 99);   // list.set(index, value);
		list.remove(2);
		System.out.println(list);

		for(int i=0; i<5; i++){
			list.add(input.nextInt());
		}

		System.out.println(list);
		
	}
}

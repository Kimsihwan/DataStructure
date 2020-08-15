package ot.ds.list.arraylist.implementaion;

public class Main {

	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);

		ArrayList.ListIterator li = numbers.listIterator();
		while (li.hasNext()) {
			int number = (int) li.next();
			if (number == 30) {
				li.remove();
			}
			System.out.println(numbers);
		}
	}

}

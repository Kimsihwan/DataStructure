package ot.ds.list.linkedlist.implementaion;

public class Main {

	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		numbers.addList(10);
		numbers.addList(20);
		numbers.addList(30);
		numbers.add(1, 15);
		LinkedList.ListIterator i = numbers.listIterator();
		i.remove();
	}

}

package operr.demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedData {
	private List<Integer> dataLink = new LinkedList<Integer>();
	
	/**
	 * Add new value to Ln
	 * @param value
	 */
	public void addElemenet(int value) {
		dataLink.add(value);
	}
	
	public void removeTailElemenet() {
		dataLink.remove(dataLink.size() -1);
	}
	
	public void removeElemenets(int target) {
		Iterator<Integer> iterator = dataLink.iterator();
		while (iterator.hasNext()) {
			if (iterator.next() > target) {
				iterator.remove();
			}
		}
	}
	
	public void print() {
		for (int i = 0; i < dataLink.size(); i++) {
			System.out.println(dataLink.get(i));
		}
		
	}
}

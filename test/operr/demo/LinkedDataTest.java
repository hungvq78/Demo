package operr.demo;

import org.junit.Test;

public class LinkedDataTest {
	@Test
	public void testClass() {
		LinkedData LinkedDataTest = new LinkedData();
		for (int i = 0; i < 10; i++) {
			LinkedDataTest.addElemenet(i);
		}

		// print new list
		LinkedDataTest.print();

		// print list
		LinkedDataTest.removeTailElemenet();
		LinkedDataTest.print();

		// print list
		LinkedDataTest.removeElemenets(5);
		LinkedDataTest.print();

	}
}

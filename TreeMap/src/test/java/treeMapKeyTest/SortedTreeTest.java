package treeMapKeyTest;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.Test;

public class SortedTreeTest {

	@Test
	public void test() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(5);
		SortedSet<Integer> set = new TreeSet<Integer>();
		set.addAll(list);
		SortedSet<Integer> result = new TreeSet<Integer>();
		result.add(1);
		result.add(2);
		result.add(4);
		result.add(5);

		assertEquals(result, set);
	}

}

package treeMapKeyTest;

import static org.junit.Assert.*;

import org.junit.Test;

import treeMap.TreeMap;


public class TreeMapTest {

	@Test
	public void testKeyTreeAdd() {
		TreeMap<Integer, Integer> tree = getTreeInterf();

		tree.put(2,12);
		tree.put(3,13);
		tree.put(4,14);

		assertNotNull(tree);

	}

	@Test
	public void testKeyTreeGet()  {
		TreeMap<Integer,Integer> tree = getTreeInterf();

		tree.put(2,120);
		tree.put(3,130);
		tree.put(4,140);
		tree.put(5,2);
		tree.put(6,10);
		tree.put(7,15);
		tree.put(8,150);
		tree.put(9,1);
		tree.put(10,56);
		tree.put(11,34);
		tree.put(12,90);
		int result = tree.get(12);

		assertEquals(90, result);

	}

	private TreeMap<Integer,Integer> getTreeInterf() {
		return (TreeMap<Integer, Integer>) new TreeMap<Integer,Integer>(1,11);
	}

}

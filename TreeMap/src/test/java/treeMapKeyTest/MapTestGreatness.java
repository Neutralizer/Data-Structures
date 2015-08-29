package treeMapKeyTest;

import static org.junit.Assert.*;

import org.junit.Test;

import treeMapInterf.TreeMapInterf;

import treeMap.TreeMap;

public class MapTestGreatness {

	@Test
	public void testTreeMapPut() {
		TreeMapInterf<Integer,Integer> tree = getTreeMapInterf();
		TreeMap<Integer,Integer> treeGorgeous =  new TreeMap<Integer, Integer>(1,1);

		treeGorgeous.put(2, 20);
		treeGorgeous.put(3, 30);
		treeGorgeous.put(4, 40);
		treeGorgeous.put(5, 50);
		treeGorgeous.put(2, 20);
		
		
		assertNotNull(treeGorgeous);
		
		
	}

	@Test
	public void testTreeMapGet() {
		TreeMapInterf<Integer,Integer> treeGorgeous = 
				(TreeMapInterf<Integer, Integer>) new TreeMap<Integer, Integer>(1,1);

		treeGorgeous.put(2, 20);
		treeGorgeous.put(3, 30);

		int result = ((TreeMap<Integer, Integer>) treeGorgeous).get(2);

		assertEquals(20, result);
		
		
		treeGorgeous.put(4, 40);
		treeGorgeous.put(5, 50);
		treeGorgeous.put(2, 220);
		
		int resultChanged = 
				((TreeMap<Integer, Integer>) treeGorgeous).get(2);
		assertEquals(220, resultChanged);
		
		
	}
	
	@Test
	public void testTreeMapContains() {
		TreeMapInterf<Integer,Integer> treeGorgeous = 
				(TreeMapInterf<Integer, Integer>) new TreeMap<Integer, Integer>();

		treeGorgeous.put(2, 20);
		treeGorgeous.put(3, 30);

		boolean result = ((TreeMap<Integer, Integer>) treeGorgeous)
				.containsValue(30);

		
		
		treeGorgeous.put(4, 40);
		treeGorgeous.put(5, 50);
		treeGorgeous.put(2, 220);
		
		assertEquals(true, result);
	}
	
	
	private TreeMapInterf<Integer, Integer> getTreeMapInterf() {
		return new TreeMap<Integer, Integer>(1,1);
	}

}

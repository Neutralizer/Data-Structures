package mapTest;

import static org.junit.Assert.*;

import org.junit.Test;

import impl.KeyNotFoundException;
import impl.MapListImpl;
import interf.MapStr;

public class MapListTest<K, V> {

	@Test
	public void testMapPut() {

		MapStr<Integer, Integer> map = getMap();

		map.put(2, 3);
		

		assertNotNull(map);

	}



	@Test
	public void testMapGet() throws KeyNotFoundException {

		MapStr<Integer, Integer> map = getMap();

		map.put(1, 2);
		map.put(2, 3);
		map.put(3, 4);

		assertEquals((Integer) 2, map.get(1));
		assertEquals((Integer) 4, map.get(3));

		MapStr<Integer, String> mapStringValue = getMap(0, "aa");

		mapStringValue.put(1, "a");
		mapStringValue.put(2, "b");
		mapStringValue.put(3, "c");

		assertEquals("a", mapStringValue.get(1));

		assertEquals("b", mapStringValue.get(2));

		mapStringValue.put(2, "p");

		assertEquals("p", mapStringValue.get(2));
	}

	@Test
	public void isEmptyTest() {
		MapStr<Integer, Integer> map = getMap();

		assertEquals(true, map.isEmpty());

		map.put(1, 1);

		assertEquals(false, map.isEmpty());

	}


	private MapStr<Integer, String> getMap(int i, String string) {
		return new MapListImpl<Integer, String>(i, string);
	}
	
	private MapStr<Integer, Integer> getMap() {
		return  new MapListImpl<Integer, Integer>();
	}
	


}

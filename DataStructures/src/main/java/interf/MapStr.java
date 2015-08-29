package interf;

import impl.KeyNotFoundException;

public interface MapStr<K, V> {

	
	/**
	 * inserts a key value set in the Map
	 * @param key 
	 * @param value 
	 */
	
	void put(K key, V value);
	
	/**
	 * 
	 * @param K
	 * @return the value of the specified key
	 */
	
	V get(K key) throws KeyNotFoundException;
	
	/**
	 * Check if the Map is empty
	 * @return true if the Map is empty
	 */
	
	boolean isEmpty();
}









package treeMapInterf;


public interface TreeMapInterf<K, V> {
	

	/**
	 * inserts a key value set in the Map
	 * @param key 
	 * @param value 
	 */
	
	V put(K key, V value);

	/**
	 * 
	 * @param K
	 * @return the value of the specified key
	 */
	
	V get(K key);
	

	/**
	 * Check if the Map is empty
	 * @return true if the Map is empty
	 */
	

	boolean isEmpty();

}
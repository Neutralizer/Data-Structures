package impl;

import interf.MapStr;

public class ArrayMap<K, V> implements MapStr<K, V> {

	private K[] arrayKeys;
	private V[] arrayValues;
	private int counter = 0;
	
	public ArrayMap(){
		 this.arrayKeys = (K[]) new Object[10];
		 this.arrayValues = (V[]) new Object[10];
	}
	
	public ArrayMap(int initialSize){
		 this.arrayKeys = (K[]) new Object[initialSize];
		 this.arrayValues = (V[]) new Object[initialSize];
	}
	
	

	public void put(K key, V value) {
		if (arrayKeys.length == counter) {
			extendBothArrays();
		}

		if (checkForExistingKey(key)) {
			keyValueOverride(key, value);
		} else {
			arrayKeys[counter] = key;
			arrayValues[counter] = value;
			counter++;
		}

	}

	private void keyValueOverride(K key, V value) {
		int index;
		try {
			index = getKeyIndex(key);
			arrayValues[index] = value;
		} catch (KeyNotFoundException e) {
			// do nothing
		}

	}

	private int getKeyIndex(K key) throws KeyNotFoundException {
		for (int i = 0; i < arrayKeys.length; i++) {
			if (arrayKeys[i] == key) {
				return i;
			}
		}
		throw new KeyNotFoundException();
	}

	private boolean checkForExistingKey(K key) {
		
		try {
			getKeyIndex(key);
			
		} catch (KeyNotFoundException e) {
			return false;
		}
		return true;
	}

	private void extendBothArrays() {
		K[] arrayKeysNew = (K[]) new Object[(arrayKeys.length * 2)];
		copyArray(arrayKeys, arrayKeysNew);
		this.arrayKeys = (K[]) arrayKeysNew;

		K[] arrayValuesNew = (K[]) new Object[(arrayValues.length * 2)];
		copyArray(arrayValues, arrayValuesNew);
		this.arrayValues = (V[]) arrayValuesNew;

	}

	private void copyArray(Object[] from, Object[] to) {
		for (int i = 0; i < from.length; i++) {
			to[i] = from[i];
		}
	}

	public V get(K key) throws KeyNotFoundException {
		for (int i = 0; i < arrayKeys.length; i++) {
			if (arrayKeys[i] == key) {
				return arrayValues[i];
			}
		}
		throw new KeyNotFoundException();
	}

	public boolean isEmpty() {
		if (arrayKeys[0] == null) {
			return true;
		} else {
			return false;
		}

	}

}

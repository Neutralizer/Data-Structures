package impl;

import interf.MapStr;

public class MapListImpl<K, V> implements MapStr<K, V> {
	Kutiika firstElement;
	Kutiika nextKut;
	Kutiika kutiika;
	boolean repeatingKey = false;

	public MapListImpl(K key, V value) {
		this.firstElement = new Kutiika(key, value);

	}

	public MapListImpl() {

	}

	public void put(K key, V value) {
		if (this.firstElement == null) {
			this.firstElement = new Kutiika(key, value);
		} else {
			Kutiika current = firstElement;

			while (current.nextKutiika != null) {

				if (current.getKey() == key) {
					// current.setKey(key);
					current.setData(value);
					repeatingKey = true;
					break;
				}
				current = current.nextKutiika;
			}

			if (!repeatingKey) {
				current.setNextKutiika(new Kutiika(key, value));
			}
			repeatingKey = false;
		}
	}

	public V get(K key) throws KeyNotFoundException {

		Kutiika current = firstElement;
		if (getFirstElement() == key) {
			return (V) getFirstElement().getData();
		} else {
			while (current != null) {
				if (current.getKey() == key) {
					return (V) current.getData();
				}
				current = current.nextKutiika;
			}
		}
		throw new KeyNotFoundException();
	}

	private Kutiika getFirstElement() {
		return firstElement;
	}

	public boolean isEmpty() {
		if (this.firstElement == null) {
			return true;
		}
		return false;
	}

}

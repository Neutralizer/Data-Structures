package impl;

public class Kutiika<K, V> {
	Kutiika nextKutiika;
	K key;
	V data;
	

	public Kutiika(K key, V value) {
		super();
		this.key = key;
		this.data = value;
		
	}
	

	public Kutiika(K key, V value, Kutiika next) {
		super();
		this.nextKutiika = next;
		this.key = key;
		this.data = value;
		
	}

	public Kutiika getNextKutiika() {
		return nextKutiika;
	}

	public void setNextKutiika(Kutiika nextKutiika) {
		this.nextKutiika = nextKutiika;
	}

	public V getData() {
		return data;
	}

	public void setData(V data) {
		this.data = data;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

}

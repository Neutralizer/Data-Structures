package treeMap;


public class Kutiika<K,V> {
	Kutiika nextLeft;
	Kutiika nextRight;
	K Key;
	V value;

	public Kutiika(K key, V value) {
		this.value = value;
		this.Key = key;
	}

	public K getKey() {
		return Key;
	}

	public void setKey(K key) {
		Key = key;
	}

	public Kutiika getNextLeft() {
		return nextLeft;
	}

	public Kutiika getNextRight() {
		return nextRight;
	}

	public void setNextLeft(Kutiika nextLeft) {
		this.nextLeft = nextLeft;
	}

	public void setNextRight(Kutiika nextRight) {
		this.nextRight = nextRight;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
}
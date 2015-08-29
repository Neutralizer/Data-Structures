package treeImpl;

public class Kutiika<V> {
	Kutiika nextLeft;
	Kutiika nextRight;
	V value;

	public Kutiika(V value) {
		this.value = value;
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
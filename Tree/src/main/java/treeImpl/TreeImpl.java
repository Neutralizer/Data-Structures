package treeImpl;

import treeInterf.TreeInterf;

public class TreeImpl<V> implements TreeInterf<V> {

	Kutiika<V> root;
	boolean repeatingValueCounter = false;

	public TreeImpl(V value) {
		super();
		this.root = new Kutiika(value);
	}

	public TreeImpl() {
		super();
		this.root = null;
	}

	public void addTreeValue(V value) {
		if (root == null) {
			root = new Kutiika(value);
		} else {
			Kutiika current = root;

			do {
				if (checkIfValueIsGreater(value, current)) {
					if (checkRightNode(current)) {
						current.setNextRight(new Kutiika(value));
						break;
					} else {
						current = current.nextRight;

					}
				} else {
					if (checkLeftNode(current)) {
						current.setNextLeft(new Kutiika(value));
						break;
					} else {
						current = current.nextLeft;
					}
				}

			} while (true);
		}

	}

	public V getTreeValue(V value) throws ValueNotFoundException {
		if (isNodeEqualToValue(value, root)) {
			return (V) root.getValue();
		} else {
			Kutiika current = root;

			do {
				if (checkIfValueIsGreater(value, current)) {
					if (isNodeEqualToValue(value, current)) {
						return (V) current.getValue();

					} else {
						if (checkRightNode(current)) {
							throw new ValueNotFoundException();
						}
						current = current.nextRight;
					}
				} else {
					if (isNodeEqualToValue(value, current)) {
						return (V) current.getValue();

					} else {
						if (checkLeftNode(current)) {
							throw new ValueNotFoundException();
						}
						current = current.nextLeft;

					}
				}
			} while (true);

		}

	}

	public boolean isEmpty() {
		if (this.root.getValue() == null) {
			return true;
		}
		return false;
	}

	/**
	 * Checking the value of the current node of the tree with the provided
	 * value, which will be added on the right side of the node if it is
	 * greater, or on the left side if it is smaller
	 * 
	 * @param value
	 *            the new value to be added
	 * @param current
	 *            the current node, whose value must be checked
	 * @return true if the new value is greater than the node value, or false if
	 *         the value is smaller
	 */
	private boolean checkIfValueIsGreater(V value, Kutiika current) {
		if (current.getValue().equals(value)) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isNodeEqualToValue(V value, Kutiika current) {
		if ((Integer) current.getValue() == (Integer) value) {
			return true;
		} else {
			return false;
		}
	}

	private boolean checkRightNode(Kutiika current) {
		if (current.getNextRight() == null) {
			return true;
		} else {
			return false;
		}

	}

	private boolean checkLeftNode(Kutiika current) {
		if (current.getNextLeft() == null) {
			return true;
		} else {
			return false;
		}
	}

}
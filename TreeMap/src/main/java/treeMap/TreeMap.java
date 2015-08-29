package treeMap;

import treeMapInterf.TreeMapInterf;;

public class TreeMap<K, V> implements TreeMapInterf<K, V> {

	Kutiika<K, V> root;
	int sizeCounter = 0;

	public TreeMap(K key, V value) {
		super();
		this.root = new Kutiika<K, V>(key, value);
	}

	public TreeMap() {
		super();
		this.root = null;
	}

	public V put(K key, V value) {
		if (root == null) {
			root = new Kutiika<K, V>(key, value);
			sizeCounter++;
		} else {
			Kutiika<K, V> current = root;
			do {
				if (isNodeKeyEqualToKey(key, current)) {
					// replace value of the existing key and return the previous
					// value
					V previousValue = (V) current.getValue();
					current.setValue(value);
					return previousValue;
				}

				if (checkIfKeyIsGreater(key, current)) {
					if (checkRightNode(current)) {
						current.setNextRight(new Kutiika(key, value));
						sizeCounter++;
						return null;
					} else {
						current = current.nextRight;
					}
				} else {
					if (checkLeftNode(current)) {
						current.setNextLeft(new Kutiika(key, value));
						sizeCounter++;
						return null;
					} else {
						current = current.nextLeft;
					}
				}
			} while (true);
		}
		// should not reach here
		return null;
	}

	public V get(K key) {
		if (isNodeKeyEqualToKey(key, root)) {
			return (V) root.getValue();
		} else {
			Kutiika current = root;

			do {
				if (checkIfKeyIsGreater(key, current)) {
					if (isNodeKeyEqualToKey(key, current)) {
						return (V) current.getValue();
					} else {
						if (checkRightNode(current)) {
							return null;
						}
						current = current.nextRight;
					}
				} else {
					if (isNodeKeyEqualToKey(key, current)) {
						return (V) current.getValue();
					} else {
						if (checkLeftNode(current)) {
							return null;
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

	public boolean containsValue(Object arg0) {
		if (isValueEqual((V) arg0, root)) {
			return true;
		} else {
			Kutiika currentKutiika = root;

			do {
				if (checkIfValueIsGreater((V) arg0, currentKutiika)) {
					if (isValueEqual((V) arg0, currentKutiika)) {
						return true;
					} else {
						if (checkRightNode(currentKutiika)) {
							return false;
						}
						currentKutiika = currentKutiika.nextRight;
					}
				} else {
					if (isValueEqual((V) arg0, currentKutiika)) {
						return true;

					} else {
						if (checkLeftNode(currentKutiika)) {
							return false;
						}
						currentKutiika = currentKutiika.nextLeft;

					}
				}
			} while (true);

		}

	}

	public boolean containsKey(Object arg0) {
		if (isNodeKeyEqualToKey((K) arg0, root)) {
			return true;
		} else {
			Kutiika current = root;

			do {
				if (checkIfKeyIsGreater((K) arg0, current)) {
					if (isNodeKeyEqualToKey((K) arg0, current)) {
						return true;
					} else {
						if (checkRightNode(current)) {
							return false;
						}
						current = current.nextRight;
					}
				} else {
					if (isNodeKeyEqualToKey((K) arg0, current)) {
						return true;
					} else {
						if (checkLeftNode(current)) {
							return false;
						}
						current = current.nextLeft;
					}
				}
			} while (true);

		}

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
	private boolean checkIfKeyIsGreater(K key, Kutiika current) {
		if ((Integer) key > (Integer) current.getKey()) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isNodeKeyEqualToKey(K key, Kutiika current) {
		if (current.getKey().equals(key)) {
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

	private boolean checkIfValueIsGreater(V value, Kutiika current) {
		if ((Integer) value > (Integer) current.getValue()) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isValueEqual(V value, Kutiika current) {
		if ((Integer) current.getValue() == (Integer) value) {
			return true;
		} else {
			return false;
		}
	}

	public int size() {
		return sizeCounter;
	}

}
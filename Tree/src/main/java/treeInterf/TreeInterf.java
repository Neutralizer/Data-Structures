package treeInterf;

import treeImpl.ValueNotFoundException;

public interface TreeInterf<V> {
	void addTreeValue(V value);

	V getTreeValue(V value) throws ValueNotFoundException;

	boolean isEmpty();

}
package treeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import treeImpl.TreeImpl;
import treeImpl.ValueNotFoundException;
import treeInterf.TreeInterf;

public class TreeTestSecond {

	@Test
	public void testTreeAdd() {
		TreeInterf<Integer> tree = getTreeInterf();

		tree.addTreeValue(2);
		tree.addTreeValue(10);
		tree.addTreeValue(15);

		assertNotNull(tree);

	}

	@Test
	public void testTreeGet() throws ValueNotFoundException {
		TreeInterf<Integer> tree = getTreeInterf();

		tree.addTreeValue(2);
		tree.addTreeValue(10);
		tree.addTreeValue(15);
		int result = tree.getTreeValue(15);

		assertEquals(15, result);

	}

	private TreeInterf<Integer> getTreeInterf() {
		return new TreeImpl<Integer>(5);
	}

}

package treeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import treeImpl.TreeImpl;
import treeImpl.ValueNotFoundException;
import treeInterf.TreeInterf;

public class TreeTest {

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
		tree.addTreeValue(150);
		tree.addTreeValue(1);
		tree.addTreeValue(56);
		tree.addTreeValue(34);
		tree.addTreeValue(90);
		int result = tree.getTreeValue(90);

		assertEquals(90, result);

	}

	private TreeInterf<Integer> getTreeInterf() {
		return new TreeImpl<Integer>(5);
	}

}

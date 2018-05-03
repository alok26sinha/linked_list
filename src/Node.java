
/**
 * The Class Node.
 */
class Node {

	/** The data. */
	protected int data;

	/** The link. */
	protected Node link;

	/**
	 * Instantiates a new node.
	 */
	public Node() {
		link = null;
		data = 0;
	}

	/**
	 * Instantiates a new node.
	 *
	 * @param d
	 *            the d
	 * @param n
	 *            the n
	 */
	public Node(int d, Node n) {
		data = d;
		link = n;
	}

	/**
	 * Sets the link.
	 *
	 * @param n
	 *            the new link
	 */
	public void setLink(Node n) {
		link = n;
	}

	/**
	 * Sets the data.
	 *
	 * @param d
	 *            the new data
	 */
	public void setData(int d) {
		data = d;
	}

	/**
	 * Gets the link.
	 *
	 * @return the link
	 */
	public Node getLink() {
		return link;
	}

	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	public int getData() {
		return data;
	}
}

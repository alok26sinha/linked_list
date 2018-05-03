
/**
 * The Class LinkedList.
 */
class LinkedList {
	
	/** The start. */
	protected Node start;
	
	/** The end. */
	protected Node end;
	
	/** The size. */
	public int size;

	/**
	 * Instantiates a new linked list.
	 */
	public LinkedList() {
		start = null;
		end = null;
		size = 0;
	}

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty() {
		return start == null;
	}

	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Insert at start.
	 *
	 * @param val the val
	 */
	public void insertAtStart(int val) {
		Node nptr = new Node(val, null);
		size++;
		if (start == null) {
			start = nptr;
			end = start;
		} else {
			nptr.setLink(start);
			start = nptr;
		}
	}

	/**
	 * Insert at end.
	 *
	 * @param val the val
	 */
	public void insertAtEnd(int val) {
		Node nptr = new Node(val, null);
		size++;
		if (start == null) {
			start = nptr;
			end = start;
		} else {
			end.setLink(nptr);
			end = nptr;
		}
	}

	/**
	 * Insert at pos.
	 *
	 * @param val the val
	 * @param pos the pos
	 */
	public void insertAtPos(int val, int pos) {
		Node nptr = new Node(val, null);
		Node ptr = start;
		pos = pos - 1;
		for (int i = 1; i < size; i++) {
			if (i == pos) {
				Node tmp = ptr.getLink();
				ptr.setLink(nptr);
				nptr.setLink(tmp);
				break;
			}
			ptr = ptr.getLink();
		}
		size++;
	}

	/**
	 * Delete at pos.
	 *
	 * @param pos the pos
	 */
	public void deleteAtPos(int pos) {
		if (pos == 1) {
			start = start.getLink();
			size--;
			return;
		}
		if (pos == size) {
			Node s = start;
			Node t = start;
			while (s != end) {
				t = s;
				s = s.getLink();
			}
			end = t;
			end.setLink(null);
			size--;
			return;
		}
		Node ptr = start;
		pos = pos - 1;
		for (int i = 1; i < size - 1; i++) {
			if (i == pos) {
				Node tmp = ptr.getLink();
				tmp = tmp.getLink();
				ptr.setLink(tmp);
				break;
			}
			ptr = ptr.getLink();
		}
		size--;
	}
	
	public void deleteAtTail() {
		deleteAtPos(size);
	}
	
	public void deleteAllGreaterThan(int val) {
		 Node n = start;
		 int counter = 1;
	        while (n != null)
	        {
	        	System.out.println("*****"+n.data);
	           if(n.data > val){
	        	   System.out.println("**deleted***"+n.data);
	        	   System.out.println("**counter***"+counter);
	        	   deleteAtPos(counter);
	           }else{
	        	   counter++;   
	           }
	          
	            n = n.getLink();
	       
	          
	        }
	       
	}

	/**
	 * Display.
	 */
	public void display() {
		System.out.print("\nSingly Linked List = ");
		if (size == 0) {
			System.out.print("empty\n");
			return;
		}
		if (start.getLink() == null) {
			System.out.println(start.getData());
			return;
		}
		Node ptr = start;
		System.out.print(start.getData() + "->");
		ptr = start.getLink();
		while (ptr.getLink() != null) {
			System.out.print(ptr.getData() + "->");
			ptr = ptr.getLink();
		}
		System.out.print(ptr.getData() + "\n");
	}
}
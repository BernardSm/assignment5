package assignment5;

public class Node {
	private GiftBasket data;
	private Node next;
	
	public Node() {
		super();
		this.data = new GiftBasket();
		this.next = null;
	}

	public Node(GiftBasket data) {
		super();
		this.data = data;
	}

	public Node(GiftBasket data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public GiftBasket getData() {
		return data;
	}

	public void setData(GiftBasket data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}

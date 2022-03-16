package assignment5;

public class GiftList {
	private Node head;

	public GiftList() {
		super();
		this.head = null;
	}
	
	public Node getHead() {
		return head;
	}



	public void setHead(Node head) {
		this.head = head;
	}



	public boolean isEmpty() {
		if(this.head == null) {
			return true;
		}
		return false;
	}
	
	public boolean addGiftBasketToEnd(GiftBasket g) {
			Node temp = new Node();
			temp.setData(g);
			if(head == null) {
				head = temp;
				return true;
			}
			else {
				Node current = head;
				while(current.getNext() != null) {
					current = current.getNext();
				}
				current.setNext(temp);
				return true;
			}
	}
	
	public void showAllGiftBaskets() {
		Node current = head;
		while(current != null) {
			System.out.println(current.getData().toString() + "\n");
			current = current.getNext();
		}
		
	}
	
}

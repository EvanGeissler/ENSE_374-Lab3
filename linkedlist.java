public class LinkedList{

	ListElement head; 

	public void addElement(ListElement le){
		ListElement temp = head;

		while(head.next != null){
			temp = temp.next;
		}

		head.next = new ListElelment(le);
	}

	public ListElement getElement(int index){
		
	}

	public ListElement deleteElement(int index){

	}

	public void printLinkedListTail(){

	}

	public void printLinkedListHead(){

	}
}

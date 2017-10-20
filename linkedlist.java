public class LinkedList{

	ListElement head; 

	public void addElement(ListElement le){
		ListElement temp = head;

		while(head.next != null){
			temp = temp.next;
		}

		temp.next = new ListElelment(le);
	}

	public ListElement getElement(int index){
		ListElement temp = head;
		int count = 0;

		while(count < index){
			temp = temp.next;
			count++;
		}
		
		return(temp);
	}

	public ListElement deleteElement(int index){

	}

	public void printLinkedListTail(){

	}

	public void printLinkedListHead(){

	}
}

public class LinkedList{

	ListElement head; 

	public void addElement(ListElement le){
		ListElement temp = head;
		
		if(head == null){
			head = le;
		}else{
		
			while(head.getNext() != null){
				temp = temp.getNext();
			}

			temp.setNext(le);
		}
	}

	public ListElement getElement(int index){
		ListElement temp = head;
		int count = 0;

		while(count < index){
			temp = temp.getNext();
			count++;
		}
		
		return(temp);
	}

	//public ListElement deleteElement(int index){

	//}

	public void printLinkedListTail(){

	}

	public void printLinkedListHead(){

	}
}

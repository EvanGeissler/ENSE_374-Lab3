public class LinkedList{

	ListElement head; 

	public void addElement(ListElement le){
		ListElement temp = head;
		if(head == null){
			head = le;
		}else{
			while(temp.getNext() != null){
				temp = temp.getNext();
			}

			temp.setNext(le);
		}
	}

	public ListElement getElement(int index){
		ListElement temp = head;
		int count = 0;

		if(temp == null){
			System.out.print("There are no elements available\n");
			return(temp);
		}

		while(count < index && temp != null){
			temp = temp.getNext();
			count++;
		}

		return(temp);
	}

	public ListElement deleteElement(int index){
		int count = 0;

		ListElement prev = null;
		ListElement curr = head; 
		
		if(head == null){
			System.out.print("There are no elements to delete.\n");
			return(head);
		}else{
			if(head.getData() == index){
				head = head.getNext();
				return(head);
			}

			while(curr != null && curr.getData() != index){
				prev = curr; 
				curr = curr.getNext();
			}

			if(curr == null){
				System.out.print("That node does not exist\n");
				return(curr);
			}else{
				prev.setNext(curr.getNext());
			}

			return(prev);
		}
	}


public void printLinkedListHead(){
	ListElement temp = head;

	if(temp == null){
		System.out.print("The list is currently empty.\n");
	}else if(temp.getNext() == null){
		System.out.print(temp.getData() + " ");
	}else{
		do{
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}while(temp != null);

	}

	System.out.print("\n");
}

}

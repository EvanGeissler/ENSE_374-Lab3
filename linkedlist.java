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

	public void deleteElement(int index){
		int count = 0;
		//ListElement temp = new ListElement();
		//temp = head;
		
		if(head == null){
			System.out.print("There are no elements to delete.\n");
		}else if(head.getData() == index){
			
			System.out.print("Element deleted\n");
			
		}else{

			while(count < index){
		//		temp = temp.getNext();
		//		count++;
			}

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

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

		while(count < index){
			temp = temp.getNext();
			count++;
		}

		return(temp);
	}

	//public ListElement deleteElement(int index){

	//}

	public void printLinkedListTail(){
		ListElement temp = head;

		if(temp == null){
			System.out.print("The list is currently empty.\n");
		}else if(temp.getNext() == null){
			System.out.print(temp.getData() + " ");
		}else{
			while(temp.getNext() != null){
				System.out.print(temp.getData() + " ");
				temp = temp.getNext();
			};
		}

		System.out.print("\n");
	}


	public void printLinkedListHead(){

	}
}

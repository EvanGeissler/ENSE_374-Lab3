public class Main{

public static void main(String[] args){
	//Create elements to put into linked list
	ListElement le = new ListElement();
	ListElement le2 = new ListElement();
	ListElement le3 = new ListElement();
	ListElement le4 = new ListElement(); 

	//Assign values to elements
	le.setData(5);
	le2.setData(2);
	le3.setData(3);
	le4.setData(4);

	//Print elements from ListElement Class
	System.out.print("Values from getData() (no LL): ");
	System.out.print(le.getData() + " ");
	System.out.print(le2.getData() + " ");
	System.out.print(le3.getData() + " ");
	System.out.print(le4.getData() + " ");

	//Create Linked list
	LinkedList list = new LinkedList();

	//Add elements to List
	list.addElement(le);
	System.out.print("Adding an elements...\n");
	//list.addElement(le);
	list.printLinkedListTail();

}
}

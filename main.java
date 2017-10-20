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

	System.out.print("\n\n");

	//Create Linked list
	LinkedList list = new LinkedList();

	//Add elements to List
	System.out.print("Adding an elements...\n");
	list.addElement(le);
	list.addElement(le2);
	list.addElement(le3);
	list.addElement(le4);

	//Print all elements in the list
	list.printLinkedListHead();
	System.out.print("\n");

	//Retrieve a specific element 
	ListElement temp = new ListElement();

	System.out.print("Retrieve element 0\n");
	temp = list.getElement(0);
	System.out.print("Element 0 data = " + temp.getData() + "\n\n");

	System.out.print("Retrieve element 4\n");
	temp = list.getElement(3);
	System.out.print("Element 3 data = " + temp.getData() + "\n\n");

}
}

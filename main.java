public class Main{

public static void main(String[] args){
	ListElement le = new ListElement();


	le.setData(5);
//	System.out.print("Data at node: " + le.getData());
	
	LinkedList list = new LinkedList();

	list.addElement(le);
	list.printLinkedListTail();
	}
}

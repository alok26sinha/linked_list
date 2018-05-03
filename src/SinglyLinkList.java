import java.util.Scanner;

public class SinglyLinkList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		LinkedList list = new LinkedList();
		System.out.println("Singly Linked List Test\n");
		char ch;

		do {
			System.out.println("\nSingly Linked List Operations\n");

			System.out.println("1. append at position");
			System.out.println("2. delete at tail");
			System.out.println("3. delete greater than");
			System.out.println("4. display list");
			int choice = scan.nextInt();
			switch (choice) {

			case 1:
				System.out.println("Enter integer element to insert");
				int num = scan.nextInt();
				System.out.println("Enter position");
				int pos = scan.nextInt();
				if (pos == 1) {
					list.insertAtStart(num);

				}else if (pos == list.getSize()+1 ){
					list.insertAtEnd(num);
				}
				else if (pos <= 1 || pos > list.getSize())
					System.out.println("Invalid position\n");
				else
					list.insertAtPos(num, pos);
				break;
			case 2:
				list.deleteAtTail();
				break;
			case 3:
				System.out.println("Remove all nodes greater than");
				int val = scan.nextInt();
				list.deleteAllGreaterThan(val);
				break;
			case 4:

				list.display();
				break;

			default:
				System.out.println("Wrong Entry \n ");
				break;
			}

			list.display();
			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = scan.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
	}
}
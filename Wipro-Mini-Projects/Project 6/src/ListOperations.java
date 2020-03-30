
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

	public class ListOperations {
		private List<String> list = new ArrayList<>();
		
		public boolean insert(String item) {
			if (!list.contains(item)) {
				list.add(item);
				return true;
			}
			
			return false;
		}
		
		public boolean search(String item) {
			if (list.contains(item)) {
				return true;
			}
			
			return false;
		}
		
		public boolean delete(String item) {
			if (list.contains(item)) {
				list.remove(item);
				return true;
			}
			
			return false;
		}
		
		public void display() {
			for (String item : list)
				System.out.println(item);
		}
		
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			ListOperations dictionary = new ListOperations();
			
			int choice = 0;
			
			
			do {
				System.out.println("MAIN MENU");
				System.out.println("---------");
				System.out.println("1. Insert");
				System.out.println("2. Search");
				System.out.println("3. Delete");
				System.out.println("4. Display");
				System.out.println("5. Exit");
				System.out.print("Enter your choice (1..5): ");
				choice = sc.nextInt();
				sc.nextLine();
				
				switch (choice) {
				case 1:
					System.out.print("Enter the item to be inserted: ");
					//item = sc.nextLine();
					if (dictionary.insert(sc.nextLine()))
						System.out.println("Inserted successfully.");
					else
						System.out.println("Already exists.");
					break;
					
				case 2:
					System.out.print("Enter the item to search: ");
					if (dictionary.search(sc.nextLine()))
						System.out.println("Item found in the list.");
					else
						System.out.println("Item not found in the list.");
					break;
					
				case 3:
					System.out.print("Enter the item to delete: ");
					if (dictionary.delete(sc.nextLine()))
						System.out.println("Deleted successfully.");
					else
						System.out.println("Item does not exist.");
					break;
					
				case 4:
					System.out.println("The Items in the list are: ");
					dictionary.display();
					break;
					
				case 5:
					System.exit(0);
					break;
					
				default : System.exit(0);
					break;
				}
				
			} while (choice != 5);
			
			sc.close();
		}

	}

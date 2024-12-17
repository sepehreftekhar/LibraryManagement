//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        System.out.println("Strat");

        testAddItem(lib);
        printAllLibrary(lib);
        testDuplicate(lib);
        printAllLibrary(lib);

        //menu(lib);


        System.out.println("End");



        //libraby managment

        //interface: ILibrabyItem
        //void checkOut(String borrower)
        //void CheckIn()
        //String getTitle()
        //boolean isCheckedOut()


        //abstract class LibraryItem
        //implements ILibraryItem
        //String title
        //String itemID
        //boolean CheckOut
        //String borrower
        //Abstract void displayItemDetails


        //Items

        //class Book
        //String Author
        //int pageCount

        //class Magazine
        //String issueNumber
        //String publicationDate

        //-------

        //class Library
        //void addItem(LibraryItem item)
        //void listAllItems()
        //LibraryItem findItemByTitle(String title)
        //void checkOutItem(String title, String borrower)
        //void checkInItem(String title)

        //when starting console app
        //menu
        //add new item
        //lists all items
        //checkouts
        //check ins
        //exit application


    }

    private static void printAllLibrary(Library lib) {
        System.out.println("library size equal: " + lib.getCount());
        lib.listAllItems();


    }
    private static void testDuplicate(Library lib){
        lib.duplicateItems(3,2);
        System.out.println("Items duplicated done!");
    }

    private static void testAddItem(Library lib) {

        lib.addItem(new Magazine("shahr", "R1", "A12B", "january 4, 2023"));
        lib.addItem(new Book("Fizik", "R2","sepehr", 250));
        lib.addItem(new Magazine("jahani", "R3", "S45B", "February 5, 2002"));
       // lib.addItem(new Book("Fizik", "R4","Aqa saeid", 560));
        //System.out.println("Test Items added");
    }

    public static void menu(Library library){
        Scanner scanner = new Scanner(System.in);
        int action;

        do {
            System.out.print("""
                Select from the menu below what you're planning to do. Insert the number next to the action:
                1 - Add new item
                2 - List all items
                3 - Check out item
                4 - Check in item
                400 - Exit application
                """);

            action = scanner.nextInt();
            scanner.nextLine(); // Consume newline after nextInt()

            switch (action) {
                case 1:
                    System.out.println("Adding new item...");
                    System.out.print("Enter item type (book/magazine): ");
                    String itemType = scanner.nextLine();

                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter item ID: ");
                    String itemID = scanner.nextLine();

                    if (itemType.equalsIgnoreCase("book")) {
                        System.out.print("Enter author: ");
                        String author = scanner.nextLine();
                        System.out.print("Enter page count: ");
                        int pageCount = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        library.addItem(new Book(title, itemID, author, pageCount));
                    } else if (itemType.equalsIgnoreCase("magazine")) {
                        System.out.print("Enter issue number: ");
                        String issueNumber = scanner.nextLine();
                        System.out.print("Enter publication date: ");
                        String publicationDate = scanner.nextLine();
                        library.addItem(new Magazine(title, itemID, issueNumber, publicationDate));
                    } else {
                        System.out.println("Invalid item type. Please enter 'book' or 'magazine'.");
                    }
                    break;

                case 2:
                    System.out.println("Listing all items...");
                    library.listAllItems();
                    break;

                case 3:
                    System.out.print("Enter the title of the item to check out: ");
                    String checkOutTitle = scanner.nextLine();
                    System.out.print("Enter borrower's name: ");
                    String borrower = scanner.nextLine();
                    library.checkOutItem(checkOutTitle, borrower);
                    break;

                case 4:
                    System.out.print("Enter the title of the item to check in: ");
                    String checkInTitle = scanner.nextLine();
                    library.checkInItem(checkInTitle);
                    break;

                case 400:
                    System.out.println("Exiting the application.");
                    break;

                default:
                    System.out.println("Invalid choice! Please choose from the options above.");
                    break;
            }
        } while (action != 400);

        scanner.close();
    }
}
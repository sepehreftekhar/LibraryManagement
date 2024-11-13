//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
int action;
        do {
            System.out.print("""
                Select from the menu below what you're planning to do inset the number next to them:
                adding new item (1) |  listing all items (2) |  checking out (3) |  checking in (4) |  exit application (400)
                """);

             action = scanner.nextInt();
            switch (action) {
                case 1:
                    System.out.println("Adding new item");
                    break;
                case 2:
                    System.out.println("Listing all items");
                    break;
                case 3:
                    System.out.println("Checking out");
                    break;
                case 4:
                    System.out.println("Checking in");
                    break;
                case 400:
                    System.out.println("Exiting the application");
                    break;
                default:
                    System.out.println("Invalid! Please choose from the options above");
                    break;
            }
        }while(action != 400);


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
}
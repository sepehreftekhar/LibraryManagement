import java.util.*;


public class Library {
    private List<LibraryItem> items = new ArrayList<>();


    public void duplicateItems(int index, int duplicateNumber) {
        //items = items[0] = "R1", items[1] = "R2", items[2] = "R3"
        //index = 1, duplicateNumber = 2 | expected items = items[0] = "R1", items[1] = "R2", items[2] = "R3", items[3] = "R2-duplicate-1", items[4] = "R2-duplicate-2"
        if (index < 0 || index >= items.size()) {
            System.out.println("Invalid index");
            return;
        }
        if (duplicateNumber <= 0) {
            System.out.println("Invalid duplicateNumber");
            return;
        }

        LibraryItem exisitingItem = items.get(index);
        for (int i = 0; i < duplicateNumber; i++) {


            String newItemId = exisitingItem.ItemID + "-duplicate-" + (i+1);
            if (exisitingItem instanceof Book) {
                Book book = (Book) exisitingItem;
                LibraryItem newItem = new Book(book.Title, newItemId, book.Author, book.PageCount);
                items.add(newItem);
            } else if (exisitingItem instanceof Magazine) {
                Magazine magazine = (Magazine) exisitingItem;
                LibraryItem newItem = new Magazine(magazine.Title, newItemId, magazine.IssueNumber, magazine.PublicationDate);
                items.add(newItem);
            }
        }
    }
    public void addItem(LibraryItem item) {
        // R = 1, items size = 0, R1 - E - F
        // R = 2, items size = 1, R2 - 0 - A[0] - C[0] - D - F
        // R = 3, items size = 2, R3 - 0 - A[0] - C[0] - A[1] - C[1] -  D - F
        // R = 4, items size = 3, items[1] = R4, R4 - 0 - A[0] - C[0] - A[1] - B[1]
        //System.out.println(item.ItemID);
        if (items.size() != 0) {
            for(int i= 0 ; i < items.size(); i++){
                if (items.get(i).GetTitle().equalsIgnoreCase(item.GetTitle())) {
                    return;
                }
            }
            items.add(item);
        } else {
            items.add(item);
        }
    }


    public void listAllItems() {
        for (LibraryItem item : items) {
            item.displayItemDetails();
        }
    }

    public LibraryItem findItemByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.GetTitle() == title) {
                return item;
            }
        }
        return null;
    }

    public void checkOutItem(String title, String borrower) {
        LibraryItem item = findItemByTitle(title);
        if (item != null) {
            item.CheckOut(borrower);
        } else {
            System.out.println("isn't available");
        }
        //findItemByTitle
        //CheckOut

    }

    public void checkInItem(String title) {

    }

    public int getCount() {
        return items.size();
    }

}

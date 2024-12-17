public class Book extends LibraryItem{
    String Author;
    int PageCount;

    public Book(String Title, String ItemID, String Author, int PageCount) {
        super(Title, ItemID);
        this.Author = Author;
        this.PageCount = PageCount;
    }


    public boolean IsCheckedOut() {
        System.out.println("Book: IsCheckedOut()");
        super.IsCheckedOut();
        return true;
    }


    void displayItemDetails() {
        System.out.println("Book: [" + ItemID + "] | " + Title + ", " + Author + " (" + PageCount + ")");
    }

}

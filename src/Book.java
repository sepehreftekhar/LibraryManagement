public class Book extends LibraryItem{

    String Author;
    int PageCount;

    public Book(String Title, String ItemID, String Author, int PageCount) {
        super(Title, ItemID);
        this.Author = Author;
        this.PageCount = PageCount;
    }

    @Override
    public void DisplayItemDetails() {

    }
    //String Author
    //int pageCount

}

abstract public class LibraryItem implements ILibraryItem{

    protected String Title;
    protected String ItemID;
    protected boolean CheckOut;
    protected String Borrower;

    public abstract void DisplayItemDetails();

    public LibraryItem(String Title, String ItemID){
        this.Title = Title;
        this.ItemID =ItemID;

    }

    void checkOut(String borrower){

    };
    void CheckIn(){

    }
    String getTitle(){

    }
    boolean isCheckedOut(){

    }



    //String title
    //String itemID
    //boolean CheckOut
    //String borrower
    //Abstract void displayItemDetails
}

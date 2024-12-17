abstract public class LibraryItem implements ILibraryItem{
    String Title;
    String ItemID;
    boolean CheckedOut;
    String Borrower;

    public LibraryItem(String Title, String ItemID) {
        this.Title = Title;
        this.ItemID = ItemID;
        this.CheckedOut = false;
        this.Borrower = null;
    }


    public void CheckOut(String borrower){
        if(!CheckedOut){
            this.CheckedOut = true;
            this.Borrower = borrower;
            System.out.println(Title + " has been checked out by "+ borrower);
        }else{
            System.out.println(Title + " is currently checked out.");
        }
    }


    public void CheckIn() {
        if(CheckedOut){
            this.CheckedOut = false;
            this.Borrower = null;
            System.out.println(Title + " has checked in.");
        }else{
            System.out.println(Title + " is currently checked out.");
        }
    }

    public String GetTitle() {
        return Title;
    }



    public boolean IsCheckedOut() {
        return CheckedOut;
    }

    abstract void displayItemDetails();
}

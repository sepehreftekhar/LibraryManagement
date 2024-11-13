public interface ILibraryItem {

    void CheckOut(String borrower);
    void CheckIn();
    String GetTitle();
    boolean IsCheckedOut();

    //void checkOut(String borrower)
    //void CheckIn()
    //String getTitle()
    //boolean isCheckedOut()
}

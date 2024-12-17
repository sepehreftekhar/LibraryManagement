public class Magazine  extends LibraryItem{
    String IssueNumber;
    String PublicationDate;

    public Magazine(String Title, String ItemID, String IssueNumber, String PublicationDate) {
        super(Title, ItemID);
        this.IssueNumber = IssueNumber;
        this.PublicationDate = PublicationDate;
    }
    @Override
    void displayItemDetails() {
        System.out.println("Magazine: [" + ItemID + "] | " + Title + ", " + IssueNumber + " (" + PublicationDate + ")");
    }

}

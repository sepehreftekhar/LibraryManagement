public class Magazine extends LibraryItem{

    private String IssueNumber;
    private String PublicationDate;

    public Magazine(String Title, String ItemID, String IssueNumber, String PublicationDate) {
        super(Title, ItemID);
        this.IssueNumber = IssueNumber;
        this.PublicationDate = PublicationDate;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Magazine: " + Title + ", Issue: " + IssueNumber + ", Published on: " + PublicationDate + ", ID: " + itemID);
    }
}


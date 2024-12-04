package user;

public class Breeder extends User{
    private String kennelName;
    private String kennelUrl;

    public Breeder (Long id, String firstName, String lastName, String email, String password, String kennelName, String kennelUrl) {
        super(id, firstName, lastName, email, password);
        this.kennelName = kennelName;
        this.kennelUrl = kennelUrl;
    }

    public String getKennelName() {return kennelName;}

    public void setKennelName(String kennelName) {this.kennelName = kennelName;}

    public String getKennelUrl() {return kennelUrl;}

    public void setKennelUrl(String kennelUrl) {this.kennelUrl = kennelUrl;}
}

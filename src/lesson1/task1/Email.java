package lesson1.task1;

public class Email {
    private String site;
    private String login;
    private String password;


    public Email() {
    }

    public Email(String site, String login, String password) {
        this.site = site;
        this.login = login;
        this.password = password;
    }

    public String loginToAccount(String login, String password){
        this.login = login;
        this.password = password;
        return "Your login:" + login + " " + "and password:" + password + ". Successfull log in.";
    }
    //OR
    public void login(String login, String password){
        this.login = login;
        this.password = password;
        System.out.println("Your login:" + login + " " + "and password:" + password + ". Successfull log in.");
    }


    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Email{" +
                "site='" + site + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

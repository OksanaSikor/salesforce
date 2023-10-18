package model;

public class User {

    private String url = "http://saas-dream-294.lighting.force.com/";
    private String username = "secuzaz-t6mn@force.com";
    private String password = "TMSAQA22onl";

    public User() {
    }

    public User(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

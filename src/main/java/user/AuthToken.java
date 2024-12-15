package user;

public class AuthToken {
    private String email;
    private String password;
    private boolean isAuthenticated;

    public AuthToken (String email, String password) {
        this.email = email;
        this.password = password;
        this.isAuthenticated = false;
    }

    public AuthToken () {}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        isAuthenticated = authenticated;
    }
}

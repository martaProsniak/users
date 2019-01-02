package pl.mp.users.model;

/**
 * User representation.
 */
public class User {

    /**
     * User login.
     */
    private String login;
    /**
     * User name.
     */
    private String name;
    /**
     * User last name.
     */
    private String lastName;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

package pl.mp.users.model;

import java.io.ObjectInputStream;
import java.util.Objects;

/**
 * User representation.
 */
public class User implements Comparable<User> {

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

    @Override
    public String toString() {
        String userInfo = "String name: " + name + "; String last name: " + lastName +
                "; String login: " + login + "\n";
        return userInfo;
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!login.equals(user.login)) return false;
        if (!name.equals(user.name)) return false;
        return lastName.equals(user.lastName);
    }

    @Override
    public int hashCode() {
     return Objects.hash(login, name, lastName);
    }
}

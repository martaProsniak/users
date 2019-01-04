package pl.mp.users;

import pl.mp.users.model.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class UsersMain {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        String fileName = "users.txt";
        List userList;

        userList = load(fileName);
        //print(userList);

        //Create new hash set
        Set <User> usersSet = new HashSet();

        usersSet.addAll(userList);
        print(usersSet);
    }


    /**
     * Prints data about users.
     * @param users User collection.
     */
    private static void print (Collection <User> users){
        for (Object user : users) {
            System.out.println(((User) user).getName() + " " +
                    ((User) user).getLastName() + " " +
                    ((User) user).getLogin());
        }
    }

    /**
     * Loads data from txt file and put them to a list.
     * @param fileName file path
     * @return User list.
     */
    static List<User> load(String fileName) {
        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)) {
            String usersCount = br.readLine();
            //Converts String to int
            int count = Integer.parseInt(usersCount);

            //Create a list of users
            List userList = new ArrayList<>();

            for (int i = 0; i < count; i++) {
                //create new user
                User user = new User();
                //Set user fields
                String name = br.readLine();
                user.setName(name);
                String lastName = br.readLine();
                user.setLastName(lastName);
                String login = br.readLine();
                user.setLogin(login);
                //Add user to the list
                userList.add(user);
            }
            return userList;
        } catch (IOException ex) {
            System.err.println(ex);
            return Collections.emptyList();
        }
    }


}


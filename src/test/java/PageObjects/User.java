package PageObjects;

import net.bytebuddy.utility.RandomString;

public class User {
    private String userName = "";
    private String userPassword = "";

    //if referencing a known existing user, give details
    public User(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    //if not referencing a known existing user, generate a new dynamic user
    public User() {
        //create new dynamic user name
        RandomString random = new RandomString(8);

        String userName = random.nextString();

        this.userName = userName;
        this.userPassword = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }


}

package com.example.onetapclasses;

public class LoginManager {
    public boolean authenticate(String username, String password) {
        // TODO: Add your authentication logic here database information

        // Hardcode mock
        return username.equals("shayan") && password.equals("shayan1374");
    }
}

package day01;

import java.util.Arrays;

public class AdminUser implements User{
    public String email;
    public String password;

    public AdminUser(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getUserEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        char[] output = new char[password.length()];
        Arrays.fill(output, '*');
        return new String(output);
    }
}

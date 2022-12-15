package day35_Encapsulation.task;

import utilities.ArraysUtility;

public class Credentials {

    private String username, password;

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public boolean isStrongPassword(String password){
        char[] temp = password.toCharArray();
        int[] frequency = new int[3];

        boolean strongPassword = true;

        if (temp.length >= 8 && !ArraysUtility.contains(temp,' ')){

            for (char each : temp) {

                if (Character.isLetter(each))
                        frequency[0] += 1;


                if (Character.isDigit(each))
                    frequency[1] += 1;

                if(!(Character.isLetterOrDigit(each))){
                    frequency[2] += 1;
                }
            }

            if (ArraysUtility.contains(frequency,0)){
                strongPassword = false;
            }

        }else {
            strongPassword = false;
        }

        return strongPassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (!(isStrongPassword(password))){
            System.err.println("It's not a strong password, please enter a strong password");
            System.exit(0);
        }
        this.password = password;
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
/*
create a class named Credentials
    Variables:
        username, password

    Methods:
    isStrongPassWord(): takes an argument of string and verify if the given string is strong password
        Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one letter
                3. Password should at least contain one special characters
                4. Password should at least contain a digit

    getPassword(): reads the password
    getUsername(): reads the username
    setUsername(): sets the username
    setPassword(): sets a new password,the new password MUST be a strong password
    toString():
 */
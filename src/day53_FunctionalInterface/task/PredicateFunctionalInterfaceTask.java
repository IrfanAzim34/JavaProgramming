package day53_FunctionalInterface.task;

import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateFunctionalInterfaceTask {

    public static void main(String[] args) {

        //Create a function that can verify if a strong contains duplicated characters
        Predicate<String> verifyDuplicate = s -> {

            s = s.toLowerCase();

            for (int i = 0; i < s.length(); i++) {
                if (s.indexOf(s.charAt(i)) != s.lastIndexOf(s.charAt(i)))
                    return true;
            }

            return false;
        };

        String str1 = "Irfan";
        System.out.println(verifyDuplicate.test(str1));

        System.out.println("------------------------------------------------------");

        /*
        Create a function that can verify if a password is a strong password. Characteristics of strong passwords are:
                                    1 Password must be at least have 8 characters long, and should not contain space
                                    2 PassWord should at least contain one upper case letter
                                    3 PassWord should at least contain one lower case letter
                                    4 Password should at least contain one special characters
                                    5 Password should at least contain a digit
         */
        Predicate<String> verifyPassword = s -> {

            char[] temp = s.toCharArray();
            int[] frequency = new int[4];

            if (s.length() >= 8 && !s.contains(" ")){
                for (char each : temp) {
                    if (Character.isUpperCase(each))
                        frequency[0] = 1;
                    if (Character.isLowerCase(each))
                        frequency[1] = 1;
                    if (Character.isDigit(each))
                        frequency[2] = 1;
                    if (!(Character.isLetterOrDigit(each)))
                        frequency[3] = 1;
                }
            }

            return Arrays.stream(frequency).noneMatch(p -> p == 0);

        };

        String password = "!David2 02202!";
        System.out.println(verifyPassword.test(password));

    }

}

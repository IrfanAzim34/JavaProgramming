package day14_String;

import java.util.Scanner;

public class EmailDomain_Substring {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email number, let me tell you domain:");
        String email = scan.nextLine();
        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println(domain);

        scan.close();

    }

}

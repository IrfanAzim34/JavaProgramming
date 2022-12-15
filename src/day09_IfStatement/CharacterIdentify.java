package day09_IfStatement;

public class CharacterIdentify {

    public static void main(String[] args) {

        char ch = 122;

        boolean digitCharacter = ch >= 65 && ch <= 90;
        boolean alphabeticCharacter = ch >= 97 && ch <= 122;
        boolean specialCharacter = (ch >= 32 && ch <= 47) || (ch >= 58 && ch <=64) || (ch >= 91 && ch <= 96) ||
                (ch >= 123 && ch <= 126);

        if (digitCharacter){
            System.out.println("Digit Character");
        } else if (alphabeticCharacter) {
            System.out.println("Alphabetic Character");
        } else if (specialCharacter) {
            System.out.println("Special Character");
        }else {
            System.out.println("Unknown Character!");
        }

    }

}

/*
4. Create a class called Character Identity, and write a program that can identify if the given character is a digit
    or Alphabetic Character(A~Z or a~Z) or a special character
    Ex:
        ch = '@'
    output:
        Special Character
HINT: You may wanna check out the numbers of the chracters on ASCII table
 */
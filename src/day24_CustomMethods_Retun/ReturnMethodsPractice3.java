package day24_CustomMethods_Retun;

public class ReturnMethodsPractice3 {

    public static void main(String[] args) {

        String str = "aabccdee";

        String uniqueCharacters = uniqueCharacter(str);

        System.out.println(uniqueCharacters);

    }


    public static String uniqueCharacter(String str){

        String uniqueCharacters = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }

            if (count == 1){
                uniqueCharacters += str.charAt(i) + ", ";
            }

        }

        uniqueCharacters = uniqueCharacters.trim().substring(0,uniqueCharacters.length()-2);

        return uniqueCharacters;

    }

}

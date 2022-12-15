package day24_CustomMethods_Return;

public class ReturnMehodsPractice4 {

    /*
    create a method that can remove duplciated characters from a string and returns the new value
					"aaabbcccc" ===> "abc"
     */

    public static void main(String[] args) {

        String str = "aaabbcccc";
        String removed = removeDuplicated(str);

        System.out.println(removed);

    }

    public static String removeDuplicated(String str){

        String removedDuplicated = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }

            if (count > 1 && !removedDuplicated.contains("" + str.charAt(i))){
                removedDuplicated += str.charAt(i);
            }

            if (count == 1){
                removedDuplicated += str.charAt(i);
            }
        }

        return removedDuplicated;

    }

}

package day27_WrapperClasses;

public class Task4 {

    public static void main(String[] args) {

        String str = "JAVA java";
        int upperCase = 0, lowerCase = 0;

        for (char each : str.toCharArray()) {
            if (Character.isLetter(each)){
                if (Character.isUpperCase(each)){
                    upperCase++;
                }else {
                    lowerCase++;
                }
            }
        }

        System.out.println(upperCase==lowerCase);

    }


}

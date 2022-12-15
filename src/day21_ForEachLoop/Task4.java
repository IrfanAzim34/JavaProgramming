package day21_ForEachLoop;

public class Task4 {

    /*
    write a program that can count how many palindromes in an array of string
                    Ex:
                        {"anna", "level", "Java"};
                    output:
                        2
     */

    public static void main(String[] args) {

        String[] words = {"anna", "level", "Java","ehhe","AvVa"};
        int palindromes = 0;

        for (String each : words) {
            int count = 0;
            for (int i = 0,j=each.length()-1; i < each.length(); i++,j--) {
                if ((each.toLowerCase().charAt(i) == each.toLowerCase().charAt(j)))
                    count++;
                else
                    count=0;
            }
            if (count>0)
                palindromes++;
        }

        System.out.println(palindromes);

    }

}

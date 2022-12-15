package day21_ForEachLoop;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C#", "C#", "Unique", "Python", "C++", "Python"};

        String uniqueElements = "";

        for (String each : words) {
            int count = 0;
            for (String element : words) {
                if (each.equals(element)){
                    count++;
                }
            }
            if (count == 1){
                uniqueElements += each + " ";
            }
        }

        System.out.println(uniqueElements);

    }

}

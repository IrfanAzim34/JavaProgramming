package day21_ForEachLoop;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        String[] word = {"Java Programming","Cydeo School","Wooden Spoon","Early Birds","Angry Birds"};

        for (String each:word ){
            System.out.println("" + each.charAt(0) + each.charAt(each.length()-1));
        }

    }

}

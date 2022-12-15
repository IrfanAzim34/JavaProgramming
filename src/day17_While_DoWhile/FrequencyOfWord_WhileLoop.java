package day17_While_DoWhile;


public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {

        String str = "Java Java Python Python";

        int frequency = 0;

        while (str.contains("Java")){
            str = str.replaceFirst("Java","");
            frequency += 1;
        }

        System.out.println("frequency = " + frequency);

        System.out.println("-----------------------------------------------------------------------------------------");

        String sentence = "cat cat cat cat cat cat dog dog dog cat dog cat cat";
        int frequencyCat = 0;

        while (sentence.contains("cat")){
            sentence = sentence.replaceFirst("cat","");
            frequencyCat += 1;
        }

        System.out.println("frequencyCat = " + frequencyCat);

        System.out.println("-----------------------------------------------------------------------------------------");

        String s = "java java java python python";

        int countJava = 0;
        int countPython = 0;

        while (s.contains("java") || s.contains("python")){

            if (s.contains("java")){
                s = s.replaceFirst("java","");
                countJava += 1;
            }else {
                s = s.replaceFirst("python","");
                countPython += 1;
            }
        }

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);

    }

}

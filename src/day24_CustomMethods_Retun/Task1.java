package day24_CustomMethods_Retun;

public class Task1 {

    /*
    create a method named frequencyOfWord that passes two parameters: string sentence and String word,
    then returns the frequency of word from the sentence

                        Ex:
                            sentence = "Java java java python python"
                            word = "java";
                            frequencyOfWord(sentence, word) ==>  3
     */

    public static void main(String[] args) {

        String sentence = "Java java java python python";
        String word = "java";

        frequencyOfWord(sentence,word);

    }

    public static void frequencyOfWord(String sentence,String word){

        int count = 0;

        String[] sentenceArray = sentence.split(" ");

        for (int i = 0; i < sentenceArray.length; i++) {
            if(sentenceArray[i].equals(word))
                count++;
        }

        System.out.println(count);

    }

}

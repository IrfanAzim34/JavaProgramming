package day20_Arrays;

public class AppearedTwice {

    public static void main(String[] args) {

        char[] chars = {'A', 'A', 'B', 'C', 'C', 'D', 'D'};
        String appearedTwice = "";

        for (int i = 0; i < chars.length; i++) {
            int count = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars[j]){
                    count++;
                }
            }

            if (count == 2 && !appearedTwice.contains("" + chars[i])){
                appearedTwice += chars[i] + " ";
            }
        }

        System.out.println(appearedTwice);

    }

}

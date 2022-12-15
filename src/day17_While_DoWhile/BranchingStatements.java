package day17_While_DoWhile;

public class BranchingStatements {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
            if (i == 'E'){
                break;
            }
        }

        System.out.println();

        System.out.println("-----------------------------------------------------------------------------------------");

        int i = 10;

        while (-10 < i){
            System.out.println(i);
            --i;
            if (i == 0){
                break;
            }
        }

    }

}

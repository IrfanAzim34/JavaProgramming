import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
                                input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO. Write you code below this line.

        int[] current = new int[inhabitants.length];
        int[] empty = new int[inhabitants.length];
        int day = 1;

        System.out.println("Day 0 " + Arrays.toString(inhabitants));

        while(!(Arrays.equals(inhabitants,empty))) {


            for (int i = 0; i < inhabitants.length; i++) {
                if (inhabitants[i] != 0) {
                    if (i == 0) {
                        if (inhabitants[i + 1] == 0) {
                            current[i] = inhabitants[i] / 2;
                        } else {
                            current[i] = inhabitants[i];
                        }
                        continue;
                    }

                    if (i == inhabitants.length - 1) {
                        if (inhabitants[i - 1] == 0) {
                            current[i] = inhabitants[i] / 2;
                        } else {
                            current[i] = inhabitants[i];
                        }
                        continue;
                    }

                    if (inhabitants[i - 1] == 0 || inhabitants[i + 1] == 0) {
                        current[i] = inhabitants[i] / 2;
                    } else {
                        current[i] = inhabitants[i];
                    }

                }
            }

            inhabitants = Arrays.copyOf(current, current.length);

            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            day++;

        }

        System.out.println("---- EXTINCT ----");

    }

}

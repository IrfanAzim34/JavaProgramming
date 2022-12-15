package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "1234";

        int num = Integer.parseInt(str);

        System.out.println(num + 1);
        System.out.println(str + 1);

        System.out.println("-----------------------------------------------------");

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2);
        System.out.println(num2 + 1);
        System.out.println(str2 + 1);


        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        long max1 = Long.MAX_VALUE;
        long min1 = Long.MIN_VALUE;
        System.out.println("max1 = " + max1);
        System.out.println("min1 = " + min1);


        String s1 ="maybe";
        boolean flag = Boolean.parseBoolean(s1);
        System.out.println(flag);

        System.out.println("-------------------------------------------------------");

        String s2 = "123";
        Integer x = Integer.valueOf(s2);
        int y = Integer.valueOf(s2);
        System.out.println(x + 1);
        System.out.println(y + 1);

        String s3 = "1.5";
        Double z = Double.valueOf(s3);
        System.out.println(z+1);

        System.out.println("-------------------------------------------------------");

        char ch1 = 'z';
        // isDigit()
        boolean flag1 = Character.isDigit(ch1);
        // isLetter()
        boolean flag2 = Character.isLetter(ch1);
        // special char
        boolean flag3 = !Character.isLetterOrDigit(ch1);
        // isUpperCase()
        boolean flag4 = Character.isUpperCase(ch1);
        // isLowerCase()
        boolean flag5 = Character.isLowerCase(ch1);
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(flag4);
        System.out.println(flag5);

        System.out.println("--------------------------------------------------------");

        String str1 = "ab1cde2efg3hi4";
        int sum = 0;

        for (char each : str1.toCharArray()) {
            if (Character.isDigit(each)){
                sum += Integer.parseInt(""+each);
            }
        }

        System.out.println("sum = " + sum);

    }

}

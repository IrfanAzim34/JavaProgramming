package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;
    final static String name;

    static {
        name = "Irfan";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        final double pi = 3.14;
//        pi = 2.3;  final variables can not be reassigned

        FinalVariable obj = new FinalVariable("May/01");
        System.out.println(obj.birthDay);
//        obj.birthDay = "March/04";  //can be reassigned a final variable

        System.out.println(FinalVariable.name);
//        FinalVariable.name = "Azim"; //can be reassigned a final variable

    }

}

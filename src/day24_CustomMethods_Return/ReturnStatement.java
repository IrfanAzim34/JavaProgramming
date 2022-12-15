package day24_CustomMethods_Return;

public class ReturnStatement {


    public static void main(String[] args) {

        nameOfTheMonth(2);

    }

    public static void nameOfTheMonth(int number){

        String result = "";

        if (1 > number || number > 12) {
            System.err.println("Invalid");
            return;
        }

            switch (number) {
                case 1:
                    result = "January";
                    break;

                case 2:
                    result = "February";
                    break;

                case 3:
                    result = "March";
                    break;

                case 4:
                    result = "April";
                    break;

                case 5:
                    result = "May";
                    break;

                case 6:
                    result = "June";
                    break;

                case 7:
                    result = "July";
                    break;

                case 8:
                    result = "August";
                    break;

                case 9:
                    result = "September";
                    break;

                case 10:
                    result = "October";
                    break;

                case 11:
                    result = "November";
                    break;

                default:
                    result = "December";
            }

        System.out.println(result);
    }

}

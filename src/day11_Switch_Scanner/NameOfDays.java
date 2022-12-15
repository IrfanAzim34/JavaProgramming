package day11_Switch_Scanner;

public class NameOfDays {

    /*
    NumberOfDays
			28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12

			If(1~12){


			}else{
				Invalid
			}
     */

    public static void main(String[] args) {

        int number = 2;
        int year = 2001;
        String result = "";

        if (1 <= number && number <= 12) {

            switch (number) {
                case 2:
                    result = (year % 4 == 0)?"29 Days" :"28 Days";
                    break;

                case 4: case 6: case 9: case 11:
                    result = "30 Days";
                    break;

                default:
                    result = "31 Days";

            }
        }else {
            result = "Invelid";
        }
        System.out.println(result);

    }
}

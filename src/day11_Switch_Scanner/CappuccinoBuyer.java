package day11_Switch_Scanner;




public class CappuccinoBuyer {

    /*
    Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price
    and calories of cappuccino

    Valid sizes are tall, grande, venti and their price & calories are:
                    tall:
                        price is $3.69
                        90 calories

                    grande:
                        price is $3.99;
                        120 calories

                    venti:
                        price is $4.29
                        150 calories

                    If the size is invalid then the output should be "Invalid Size"

                                Note:
                                    Solution 1: use nested if statement
                                    Solution 2: use switch statement
                                    Solution 2: use if & switch statements mixed
     */

    public static void main(String[] args) {


        String size = "grande",
                result ="";
        double tallPrice = 3.69,
                grandePrice = 3.99,
                ventiPrice = 4.29;
        int caloriTall = 90,
                caloriGrande = 120,
                caloriVenti = 150;

        if (size == "tall" || size == "grande" || size == "venti"){
            switch (size){
                case "tall":
                    result = "\ntall:\n\tprice is $" + tallPrice + "\n\t" + caloriTall + " calories";
                    break;

                case "grande":
                    result = "\ngrande:\n\tprice is $" + grandePrice + "\n\t" + caloriGrande + " calories";
                    break;

                default:
                    result = "\nventi:\n\tprice is $" + ventiPrice + "\n\t" + ventiPrice + " calories";
            }
        }else {
            result = "Invalid Size: " + size;
        }

        System.out.println(result);

    }

}

package day51_Map;

public class TestEnum {

    public static void main(String[] args) {

        Browser browser = Browser.FIREFOX;

        switch (browser){
            case CHROME:
                System.out.println("Chrome is selected");
                break;
            case OPERA:
                System.out.println("Opeara is selected");
                break;
            case EDGE:
                System.out.println("Edge is selected");
                break;
            case SAFARI:
                System.out.println("Safari is selected");
                break;
            default:
                System.out.println("FireFox is selected");
        }

        System.out.println("------------------------------------------------------------");

        Season season = Season.SUMMER;



    }

}

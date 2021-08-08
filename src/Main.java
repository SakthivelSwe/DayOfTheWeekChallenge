public class Main {
    public static void main(String[] args) {
        System.out.println("DayOfTheWeekChallenge if and else if outputs");
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
        printDayOfTheWeek(8);

        System.out.println();
        System.out.println("DayOfTheWeekChallenge Switch outputs");
        printDayOfTheWeekSwitch(1);
        printDayOfTheWeekSwitch(2);
        printDayOfTheWeekSwitch(3);
        printDayOfTheWeekSwitch(4);
        printDayOfTheWeekSwitch(5);
        printDayOfTheWeekSwitch(6);
        printDayOfTheWeekSwitch(7);
        printDayOfTheWeekSwitch(-1);



    }
    //First Method
    //using if and else if
    private static void printDayOfTheWeek(int day) {
        if(day == 1) {
            System.out.println("Sunday");
        }else if(day == 2) {
            System.out.println("Monday");
        }else if(day == 3) {
            System.out.println("Tuesday");
        }else if(day == 4) {
            System.out.println("Wednesday");
        }else if(day == 5) {
            System.out.println("Thursday");
        }else if(day == 6) {
            System.out.println("Friday");
        }else if(day == 7) {
            System.out.println("Saturday");
        }else {
            System.out.println("Invalid Day");
        }
    }
    //Second Method
    //using SwitchStatement

    private static void printDayOfTheWeekSwitch(int Day) {
        switch(Day) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("Invalid day");

        }
    }
}

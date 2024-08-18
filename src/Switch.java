public class Switch {
    public static void main(String[] args) {
        String day = "Monday";

        if (day == "Monday") {
            System.out.println("It's Monday");
        } else if (day == "Tuesday") {
            System.out.println("It's Tuesday");
        } else {
            System.out.println("It's another day, your off duty!");
        }

        // SWITCH
        String switchDay = "Saturday";

        switch (switchDay) {
            case "Monday":
                System.out.println("It's Monday, time to study!");
                break;
            case "Tuesday":
                System.out.println("It's Tuesday, time to do laundry");
                break;
            case "Wednesday":
                System.out.println("It's Wednesday, time to go to school!");
                break;
            case "Thursday":
                System.out.println("It's Thursday, time to go to the gym!");
                break;
            case "Friday":
                System.out.println("It's Thursday, time to study!");
                break;
            default:
                System.out.println("It's weekend, you are off duty!");
                break;
        }
    }
}

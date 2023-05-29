public class Main{
    public static void main(String[] args) {
        int age = 50;
        if(age > 50){
            System.out.println("I will retire");
        }else if(age == 50){
            System.out.println("I will work");
        }else{
            System.out.println("I will marry");
        }


        // Switch
        int daysOfWeek = 7;
        String dayName;

        switch(daysOfWeek){
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
           default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("Today is " + dayName);
    }
}
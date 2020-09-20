package LabWeek10.Com;


public enum WeekDays {
    MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5)
    ,SATHURDAY(6){
        void days(){
            System.out.println("This is a weekend day");
    }},SUNDAY(7){
            void days(){
            System.out.println("This is a weekend day");
        }};

    WeekDays(int dayNumber){
        this.day = dayNumber;

    }
    int day;
     void days(){
        System.out.println("This is week day");
    }

}
class Test{
    public static void main(String[] args) {
        WeekDays[] weekDays = WeekDays.values();
        for (WeekDays day:weekDays
             ) {
            System.out.println(day+"("+day.ordinal()+")");
            day.days();

        }


    }
}



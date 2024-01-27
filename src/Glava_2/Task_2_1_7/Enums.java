package Glava_2.Task_2_1_7;
public class Enums {
    public static void main(String[]args){
        System.out.println(Day.SATURDAY.isWeekend("SATURDAY"));
        System.out.println(Day.SUNDAY.isWeekend("SUNDAY"));
        System.out.println(Day.SATURDAY.getRusName());
        System.out.println(Day.SUNDAY.getRusName());
    }
    public enum Day{
        MONDAY("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота"),
        SUNDAY("Воскресенья");
        private String name;
        Day(String name){
            this.name=name;
        }
        public boolean isWeekend(String Day){
            boolean result;
            if(Day.equals("SATURDAY")|| Day.equals("SUNDAY")){
                result=true;
            }else{
                result=false;
            }
            return result;
        }
        public String getRusName(){
            return name;
        }



    }
}


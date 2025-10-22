package test;

//In Java, enum (short for enumeration-गणना) is a special data type used
// to define a fixed set of constants.
         //Enum constants are public, static, and final
                //You can't create new instances at runtime
                           //You can use enums in collections, maps, etc.
public class enum_ {
    public enum Status {
        SUCCESS(200),
        ERROR(500),
        NOT_FOUND(404);

        private int code;

        Status(int code) {  // like costructor
            this.code = code;

        }
        public int getCode() {
            return code;

        }
    }
    public static void main(String[] args) {
        Status s = Status.ERROR;
        System.out.println(s);            // ERROR
        System.out.println(s.getCode());  // 500


    }
    }

class enum_2 {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Day today = Day.MONDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start of the week!");
                break;
            case FRIDAY:
                System.out.println("Almost weekend!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Midweek day.");
        }
    }
}
// no need of any class
    enum my{
        s(1), f(2);
        int c;
        my(int c){
           this.c=c;
        }
        public int getc(){
            return c;
        }
        public static void main(String[] args) {
           my m=my.s;

            System.out.println("m.getc()----------"+m.getc());
            System.out.println("my.s----------"+my.s);

        }
    }

package lessonArray;

public class ExampleArrays {
    public static void main(String[] args) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < 12; i++) {
            System.out.println("days[" + i + "] = " + days[i]);
        }
        String[] month = new String[12];
        month[0] = "январь";
        month[1] = "февраль";
        month[2] = "март";
        month[3] = "апрель";
        month[4] = "май";
        month[5] = "июнь";
        month[6] = "июль";
        month[7] = "август";
        month[8] = "сентябрь";
        month[9] = "октябрь";
        month[10] = "ноябрь";
        month[11] = "декабрь";
        for (int i = 0; i < 12; i++) {
            System.out.println("month[" + i + "] = " + month[i]);
        }

    }
}

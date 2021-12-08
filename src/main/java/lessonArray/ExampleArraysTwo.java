package lessonArray;

public class ExampleArraysTwo {
    public static void main(String[] args) {
        int counter = 1;
        int[][] table = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = counter;
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
    }
}

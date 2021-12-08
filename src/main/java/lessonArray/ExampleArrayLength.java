package lessonArray;

public class ExampleArrayLength {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 4, 5, 6, 8, 3, 5, 1, 9, 0}; //int[] arr = new int[12]; arr[0] = 1; ...
        System.out.println("arr.length: " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(arrSum(arr));

    }
    public static int arrSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}

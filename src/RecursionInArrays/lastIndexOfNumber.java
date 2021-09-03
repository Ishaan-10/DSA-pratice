package RecursionInArrays;

public class lastIndexOfNumber {

    public static int lastIndex(int arr[], int num, int index) {

        if (arr.length == index) {
            return -1;
        }

        int smallAns = lastIndex(arr, num, index + 1);
        if (smallAns != -1) {
            return smallAns;
        }
        if (arr[index] == num) {
            return index;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 20, 10, 32, 19, 38, 10 };
        System.out.println(lastIndex(arr, 38, 0));
    }
}

import java.util.Scanner;

public class a2 {

    public int[] getSub(int[] arr, int start_idx, int end_idx) {

        int length = end_idx - start_idx + 1;


        int[] result = new int[length];

        for(int i=start_idx; i <= end_idx; i++) {
            result[i - start_idx] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        a2 obj = new a2();

        System.out.println("Enter the number of elements in the array: ");
        int n = scn.nextInt();


        int[] arr = new int[n];


        System.out.println("Enter the elements: ");

        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }


        System.out.println(" Enter the start index :");
        int start_idx = scn.nextInt();
        System.out.println(" Enter the end index");
        int end_idx = scn.nextInt();

        int[] subarray = obj.getSub(arr, start_idx, end_idx);

        System.out.println("Sub array:");

        for(int num: subarray) {
            System.out.print(num + " ");
        }
    }
}
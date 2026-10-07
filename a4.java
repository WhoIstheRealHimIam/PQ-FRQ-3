import java.util.Scanner;
import java.util.HashSet;

public class a4 {
    public int findNumber(int[] arr,  int n) {

        HashSet<Integer> numbers = new HashSet<>();

        for(int num : arr) {
            numbers.add(num);
        }

        for(int i = 1; i <= n; i++){
            if(!numbers.contains(i)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        a4 obj = new  a4();
        System.out.println("Enter the size of the array(excl the missing num): ");
        int n = scn.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i< n; i++) {
            arr[i] = scn.nextInt();
        }

        int missingNUM = obj.findNumber(arr, n);
        if(missingNUM != -1) {
            System.out.println("The missing number is: " + missingNUM);
        } else {
            System.out.println("No missing number found.");
        }
    }
}
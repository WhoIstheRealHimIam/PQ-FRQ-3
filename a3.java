import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class a3 {

    public int[] getUnique(int[] arr, int[] arr2) {

        Set<Integer> set = new HashSet<>();

        for(int num : arr) {
            set.add(num);
        }
        for(int num : arr2) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int index = 0;


        for(int num : arr) {
            result[index] = num;
            index++;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        a3 obj = new a3();

        System.out.println("Enter the size of the array: ");
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n1; i++) {
            arr1[i] = scn.nextInt();
        }
        System.out.println("Enter the size of the array2: ");
        int n2 = scn.nextInt();
        int[] arr2 = new int[n1];
        System.out.println("Enter the elements of the array2: ");
        for(int i=0; i<n2; i++) {
            arr1[i] = scn.nextInt();
        }

        int[] result = obj.getUnique(arr1, arr2);


        System.out.println("Unique elements from both arrays: ");
        for(int num : result) {
            System.out.println(num + " ");
        }



    

    }
}
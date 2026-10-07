import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class a1 {
    public int[] findDup(int[] arr) {

        Set<Integer> uniqueval = new HashSet<>();
        Set<Integer> dupval = new HashSet<>();

        for(int num: arr) {
            if(!uniqueval.add(num)) {
                dupval.add(num);
            }
        }

        int[] result = new int[dupval.size()];

        int index =0;


        for(int num : dupval) {
            result[index] = num;
            index++;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of elements");

        int n = scn.nextInt();

        int[] input = new int[n];

        System.out.println("Enter the elements");

        for(int i=0; i < n; i++) {
            input[i] = scn.nextInt();

        }

        a1 obj = new a1();

        int[] result = obj.findDup(input);

        if(result.length > 0) {
            System.out.println("The contents of the array");
            for(int num : result) {
                System.out.println(num + " ");
            } 
        }
        else {
            System.out.println("no duplicates found");
        }

    }
}
// 6 // WAP in java to the make substring out of a given sequence with no repeating sequence 
// take input (n)
// take array [1,2,3,4,5,6,7,8]
// if n = 2 then, 
// output will be (1,2),(3,4),(5,6),(7,8)
// if n = 3 then,
// output will be (1,2,3),(4,5,6),(7,8)



import java.util.Scanner;

public class SubstringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        // Taking array elements input
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Taking n input
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Output groups:");

        // Loop through array and split into groups of size n
        for (int i = 0; i < arr.length; i += n) {
            System.out.print("(");
            for (int j = i; j < i + n && j < arr.length; j++) {
                System.out.print(arr[j]);
                if (j < i + n - 1 && j < arr.length - 1) {
                    System.out.print(",");
                }
            }
            System.out.print(")");
            if (i + n < arr.length) {
                System.out.print(",");
            }
        }
    }
}


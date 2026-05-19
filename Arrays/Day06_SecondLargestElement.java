// Problem: Find Second Largest Element in Array

public class Day06_SecondLargestElement {

    public static int secondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : arr) {

            if(num > largest) {

                secondLargest = largest;
                largest = num;

            } else if(num > secondLargest && num != largest) {

                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 5, 8, 25};

        System.out.println("Second Largest: " + secondLargest(arr));
    }
}
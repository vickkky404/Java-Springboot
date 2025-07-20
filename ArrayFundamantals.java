



public class ArrayFundamantals {
    public static void main(String[] args){
        int[] arr1 = new int[5];

        int[] arr2 = {10,20,30,40,50};

        int[] arr3 = new int[]{1,2,3,4,5};

        System.out.println("=== Array Creation Example ===");
        System.out.println("Arr1 length: " + arr1.length);
        System.out.println("Arr2 length" + arr2.length);


        // Accessing Elements.
        System.out.println("\n===Accessing Elements===");
        System.out.println("First element of arr2: " + arr2[2]);
        System.out.println("Last element of arr2: " + arr2[arr2.length-1]);


        // Modifying Elements
        arr2[0] = 100;
        System.out.println("Modified First element: " + arr2[0]);


        // /Traversing Array(3 ways.)

        // way1:using for each
        System.out.println("Using For each");
        for(int element : arr2){
            System.out.println(element + " ");
        }
        System.out.println();

        // way 2 : using traditional loop
        System.out.println("Using For loop");
        for(int i = 0; i < arr2.length ; i++){
            System.out.println(arr2[i] + " ");
        }
        System.out.println();

        // way 3: while loop.
        System.out.println ("Using While loop");
        int i = 0;
        while(i < arr2.length){
            System.out.println(arr2[i] + " ");
            i++;
        }

        // Common Array Operations
        System.out.println("\n===Common Array Operations===");
        int[] numbers = {64 , 34 , 25 , 12 , 22 , 11 , 90};

        // Find max element
        int max = findmax(numbers);
        System.out.println("Max element: " + max);

        // min element
        int min = findMin(numbers);
        System.out.println("Min element: " + min);


       // search elements 
        int sum = calculateSum(numbers);
        System.out.println("Sum of elements: " + sum);

        
        // Search for element
        int searchElement = 25;
        int index = linearSearch(numbers, searchElement);
        if(index != -1) {
            System.out.println(searchElement + " found at index: " + index);
        } else {
            System.out.println(searchElement + " not found!");
        }

        reverse


        
        
    }
}

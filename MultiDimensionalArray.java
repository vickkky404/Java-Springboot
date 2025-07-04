public class MultiDimensionalArray {
    public static void main(String[] args) {
        // array of array is multi dimensional aray
        // nums[] [] = new int[][];

        int nums[] [] = new int[2] [4];

        for(int i = 0;i<=3;i++){
            for(int j = 0; j<4; j++){
                System.out.print(nums[i] [j] + " ");
            }
            System.out.println();
        }
    }
}

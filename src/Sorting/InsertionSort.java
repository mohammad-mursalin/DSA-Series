package Sorting;

public class InsertionSort {

    public static void main(String[] args) {

        int nums[] = {3,5,2,7,1,9,4};

        int size = nums.length;
        int j = 0;
        int key = 0;

        System.out.println("Before sorting ");
        for(int n : nums)
            System.out.print(n+ " ");

        for (int i = 1 ; i < size ; i++) {

            key = nums[i];
            j = i-1;

            while(j >= 0 && key < nums[j]) {

                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
            System.out.println();
            for(int n : nums)
                System.out.print(n+ " ");
        }

        System.out.println();
        System.out.println("After sorting ");
        for(int n : nums)
            System.out.print(n+ " ");
    }
}

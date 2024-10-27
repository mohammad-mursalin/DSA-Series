package Sorting;

public class SelectionSort {

    public static void main(String[] args) {

        int nums[] = {3,5,2,7,1,9,4};

        int size = nums.length;
        int temp = 0;
        int min = -1;

        System.out.println("Before sorting ");
        for(int n : nums)
            System.out.print(n+ " ");

        for (int i = 0 ; i < size - 1 ; i++) {

            min = i;

            for(int j = i ; j < size ; j++) {

                if(nums[min] > nums[j]) {
                    min = j;
                }
            }
            temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }

        System.out.println();
        System.out.println("After sorting ");
        for(int n : nums)
            System.out.print(n+ " ");
    }
}

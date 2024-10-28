package Sorting;

public class QuickSort {

    public static void main(String[] args) {

        int nums[] = {3,5,2,7,1,9,4};

        int size = nums.length;

        System.out.println("Before sorting ");
        for(int n : nums)
            System.out.print(n+ " ");

        quickSort(nums, 0, size - 1);

        System.out.println();
        System.out.println("After sorting ");
        for(int n : nums)
            System.out.print(n+ " ");
    }

    public static void quickSort(int[] nums, int low, int high){

        if(low < high) {

            int piv = nums[high];
            int i = low - 1;
            int temp = 0;

            for(int j = low ; j < high ; j++) {
                if(piv > nums[j]) {
                    i++;
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
            temp = nums[i+1];
            nums[i+1] = nums[high];
            nums[high] = temp;

            System.out.println();
            for(int n : nums)
                System.out.print(n+ " ");

            quickSort(nums, low, i );
            quickSort(nums, i+1, high);
        }

    }
}



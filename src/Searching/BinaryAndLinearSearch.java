package Searching;

public class BinaryAndLinearSearch {

    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

        int target = 11;

        int indexFromLinear = linearSearch(nums, target);
        int indexFromBinary = BinarySearch(nums, target);

        System.out.println("Linear Search");

        if(indexFromLinear < 0)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index : " +indexFromLinear);

        System.out.println("Binary Search");

        if(indexFromBinary < 0)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index : " +indexFromBinary);

    }

    private static int BinarySearch(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;
        int middle;

        int steps = 0;

        while(left <= right) {

            steps++;

            middle = (left + right) / 2;

            if(target == nums[middle]) {
                System.out.println("Steps taken by binary : " +steps);
                return middle;
            }
            else if (target > middle)
                left = middle + 1;

            else
                right = middle - 1;

        }

        return -1;
    }

    private static int linearSearch(int[] nums, int target) {

        int steps = 0;

        for(int i = 0 ; i < nums.length ; i++) {

            steps++;

            if(target == nums[i]) {
                System.out.println("Steps taken by binary : " +steps);
                return i;
            }
        }

        return -1;
    }
}

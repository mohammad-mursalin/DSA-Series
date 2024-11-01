package Sorting;

public class MergeSort {

    public static void main(String[] args) {

        int nums[] = {3,5,2,7,1,9,4};

        int size = nums.length;

        for(int n : nums)
            System.out.print(n+ " ");

        merge_sort(nums, 0, size - 1);

        System.out.println();

        for(int n : nums)
            System.out.print(n+ " ");
    }

    public static void merge_sort(int[] nums, int l, int r) {

        if(l < r) {

            int mid = (l+r)/2;

            merge_sort(nums, l, mid);
            merge_sort(nums, mid + 1, r);

            merge(nums, l, mid, r);
        }

    }

    private static void merge(int[] nums, int l, int mid, int r) {

        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] lnums = new int[n1];
        int[] rnums = new int[n2];

        for(int i = 0 ; i < n1; i++)
            lnums[i] = nums[l + i];

        for(int i = 0 ; i < n2; i++)
            rnums[i] = nums[i + mid + 1];

        int k = l;
        int i = 0;
        int j = 0;

        while(i < n1 && j < n2) {

            if(lnums[i] < rnums[j]) {
                nums[k] = lnums[i];
                i++;
            }
            else {
                nums[k] = rnums[j];
                j++;
            }
            k++;
        }

        while(i < n1) {
            nums[k] = lnums[i];
            i++;
            k++;
        }
        while(j < n2) {
            nums[k] = rnums[j];
            j++;
            k++;
        }
    }

}

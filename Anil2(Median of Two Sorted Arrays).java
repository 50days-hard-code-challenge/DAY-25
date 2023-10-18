class Solution {

     public static int[] merge(int[] arr1,int[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        int[] mix = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                mix[k] = arr1[i];
                i++;
            }
            else{
                mix[k] = arr2[j];
                j++;
            }
            k++;
        }
        // it may be one of the array is not complete
        // copy the remaining element
        while(i<arr1.length){
            mix[k] = arr1[i];
            i++;
            k++;
        }
        while (j<arr2.length){
            mix[k] = arr2[j];
            j++;
            k++;
        }
        return mix;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      // After merging , store in ans array
        int[] ans = merge(nums1,nums2);
        int n = ans.length;
        double a = 0;
        double b = 0;
        if(ans.length % 2 == 0){
            a = ans[(n/2)-1];
            b = ans[n/2];
            double avg = (a+b)/2;
            return avg;

        }
        return ans[n/2];
    }
}

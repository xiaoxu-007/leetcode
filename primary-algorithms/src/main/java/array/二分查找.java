package array;

/**
 * @author Xu007
 * @create 2022-05-19 14:51
 */
public class 二分查找 {
    public static void main(String[] args) {

        int [] nums=new int[]{1,3,5,6};
        int target=9;
        System.out.println(searchInsert(nums, 2));
    }

    /**
     * 左闭右闭
     * @param nums
     * @param target
     * @return
     */
    public static int search1(int[] nums, int target) {
        // 避免当 target 小于nums[0] nums[nums.length - 1]时多次循环运算
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(right+left)>>1;
            int num=nums[mid];
            if(num==target){
                return mid;
            }
            else if(num>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }

    /**
     * 左闭右开的写法
     * @param nums
     * @param target
     * @return
     */
    public static int search2(int[] nums, int target) {
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=(right+left)>>1;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return -1;
    }



        /**
         * 递归二分查找
         * @param nums
         * @param target
         * * @return
         * */
    public static int search3(int[] nums, int target) {
    return twoGO(nums, 0, nums.length-1, target);
    }

    public static int twoGO(int[] nums,int left,int right,int target){
        if(left>right){
            return -1;
        }
        int mid=(left+right)/2;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]>target){
            return twoGO(nums, left, mid-1, target);
        }
        return twoGO(nums, mid+1, right, target);
    }


    public static int  searchInsert(int[] nums, int target) {
        //避免二分查找边界浪费时间
        if (target < nums[0]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        //二分查找
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) >> 1;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        //做判断
        if (nums[mid] > target) {
            return mid;
        } else {
            return mid + 1;
        }
    }
}

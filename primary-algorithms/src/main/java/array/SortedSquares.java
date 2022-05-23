package array;

/**
 * @author Xu007
 * @create 2022-05-23 0:34
 */
public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int [] result=new int[nums.length];
        int k=nums.length-1;
        while (left<=right){
            if(nums[left]*nums[left]<=nums[right]*nums[right]){
                result[k]=nums[right]*nums[right];
                right--;
                k--;
            }else{
                result[k]=nums[left]*nums[left];
                left++;
                k--;
            }
        }
        return result;
    }
}

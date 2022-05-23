package array;

/**
 * @author Xu007
 * @create 2022-05-23 0:47
 */
public class MinSubArrayLen {
    public static void main(String[] args) {
        int [] nums=new int[]{1,1,1,1,1,1,1,1};
        int i = minSubArrayLen(11, nums);
        System.out.println(i);
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int result=0;//结果
        int sum=0;//子序列的数值之和
        int subLength=0;//子序列长度
        for(int i=0;i<nums.length;i++){//设置子序列起点为i
            sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum>=target){
                    subLength=j-i+1;
                    int temp=result;
                    result=subLength;
                    if(temp<=result){
                        result=temp;
                    }
                }
            }
        }
        return result;
    }
    //双指针
    public int removeDuplicates1(int[] nums) {
        int fastIndex=0;
        int slowIndex=0;

        for(slowIndex=0;fastIndex<nums.length;fastIndex++){
            int val=nums[slowIndex];
            if(nums[fastIndex]!=val){
                slowIndex++;
                nums[slowIndex]=nums[fastIndex];
            }
        }
        return slowIndex+1;
    }

}

package shuzu;

import java.util.Arrays;

/**
 * @author Xu007
 * @create 2022-05-04 19:26
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int []nums ={0,1,0,3,12};
        moveZeroes1(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        if(nums==null||nums.length==0){
            return;
        }
        int index=0;
        //一次遍历，把非零的都往前挪
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
                nums[index++]=nums[i];
        }

        while(index< nums.length){
            nums[index++]=0;
        }
    }

    public static void moveZeroes1(int[] nums) {

        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;

                index++;
            }
        }
    }
}

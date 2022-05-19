package shuzu;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Xu007
 * @create 2022-04-27 0:40
 * 存在重复元素
 * 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
 */
public class ContainsDuplicate {
    //1.双循环比较。效率低
    public boolean containsDuplicate1(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    //2.Set去从
    public boolean containsDuplicate2(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for (int x:nums) {
            if(!set.add(x)){
                return true;
            }
        }
        return false;
    }


}

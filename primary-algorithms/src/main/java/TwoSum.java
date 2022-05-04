import java.util.HashMap;
import java.util.Map;

/**
 * @author Xu007
 * @create 2022-05-04 21:25
 */
public class TwoSum {
    //使用HashMap解决
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.get(target-nums[i])!=null){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{0,0};
    }
    //四分大法
    public int[] twoSum1(int[] nums, int target) {
        int[] result={0,1};
        if(nums.length<=2){
            return  result;
        }

        for(int i=0,j=nums.length-1;i<j;i++,j--){
            if(nums[i]+nums[j]==target){
                //幸运情况
                result[0]=i;
                result[1]=j;
                return result;
            }

            int x=target-nums[i];
            int y=target-nums[j];
            for(int k=i+1,m=j-1;k<=m;k++,m--){
                result[0]=i;
                if(nums[k]==x){
                    result[1]=k;
                    return result;
                }else if(nums[m]==x){
                    result[1]=m;
                    return result;
                }

                result[1]=j;
                if(nums[k]==y){
                    result[0]=k;
                    return result;
                }else if(nums[m]==y){
                    result[0]=m;
                    return result;
                }
            }
        }
        return result;
    }
}

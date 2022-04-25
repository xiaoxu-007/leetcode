/**
 * @author Xu007
 * @create 2022-04-25 22:23
 * 旋转数组
 * <p>
 * 给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,2,3,4,5,6,7], k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右轮转 1 步: [7,1,2,3,4,5,6]
 * 向右轮转 2 步: [6,7,1,2,3,4,5]
 * 向右轮转 3 步: [5,6,7,1,2,3,4]
 */
public class Rotate {

    //1使用临时数组
    public void rotate(int[] nums, int k) {
        int length=nums.length;
        int temp[]=new int[length];
        //建一个临时数组
        for(int i=0;i<length;i++){
            temp[i]=nums[i];
        }
        //然后在把临时数组的值重新放到原数组，并且往右移动k位
        for(int i=0;i<length;i++){
            nums[(i+k)%length]=temp[i];
        }
    }
}

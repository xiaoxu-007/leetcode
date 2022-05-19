package shuzu;

/**
 * @author Xu007
 * @create 2022-04-25 21:01
 * 删除排序数组中的重复项
 */
public class RemoveDuplicates {

    //双指针解法
    public int removeDuplicates1(int[] A) {
        if(A==null||A.length==0){
            return 0;
        }
        int left=0;
        for(int right=1;right<A.length;right++){
            //如果左指针和右指针指向的值一样，说明有重复的，
            //这个时候，左指针不动，右指针继续往右移。如果他俩
            //指向的值不一样就把右指针指向的值往前挪
            if(A[left]!=A[right])
                A[++left]=A[right];
        }

        return ++left;
    }

    //单指针解法
    public int removeDuplicates2(int[] A) {
        int count=0;//重复的数字

        for(int right=1;right<A.length;right++){
            if(A[right]==A[right-1]){
                //有重复的，count++
                count++;
            }else{
                //如果没有重复，后面的往前放
                A[right-count]=A[right];
            }
        }
        return A.length-count;
    }

    //网友做法
    public int removeDuplicates3(int[] A) {
        if (A.length == 0 || A == null) {
            return 0;
        }
        int count = 1;//个数
        int index = 1;//游标
        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[index - 1]) {
                continue;
            }
            A[index] = A[i];
            index++;
            count++;
        }
        return count;
    }
}

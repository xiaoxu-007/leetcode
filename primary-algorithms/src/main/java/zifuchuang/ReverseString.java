package zifuchuang;

import java.util.Arrays;

/**
 * @author Xu007
 * @create 2022-05-17 19:55
 */
public class ReverseString {

    /**
     * 双指针循环
     * @param s
     */
    public void reverseString1(char[] s){
        int left=0;
        int right=s.length-1;

        while(left<=right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }

    public void reverseString2(char[] s){
        if(s==null||s.length==0)
            return;
        reverseStringHelper(s,0,s.length-1);
    }

    private void reverseStringHelper(char[] s, int left, int right) {
        if(left>=right){
            return;
        }
        swap(s,left,right);
        reverseStringHelper(s, ++left, --right);
    }

    private void swap(char[] s, int left, int right) {
        char temp=s[left];
        s[left]=s[right];
        s[right]=temp;
    }
}

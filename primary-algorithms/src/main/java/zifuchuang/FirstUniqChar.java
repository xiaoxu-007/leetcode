package zifuchuang;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Xu007
 * @create 2022-05-18 1:12
 */
public class FirstUniqChar {
    public int firstUniqChar(String s) {
        int count[] = new int[26];
        char[] chars = s.toCharArray();

        for(int i=0;i<s.length();i++){
            count[chars[i]-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(count[chars[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }

    public int firstUniqChar2(String s) {
        char[] temp=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char t:temp){
            int count=map.getOrDefault(t, 0)+1;
            map.put(t, count);
        }
        int ans=-1;
        for(int i=0;i<temp.length;i++){
            if(map.get(temp[i])==1){
                ans=i;
                break;
            }
        }
        return ans;
    }

    public int firstUniqChar3(String s) {
        char[] chars = s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char a:chars){
            int count=map.getOrDefault(a, 0)+1;
            map.put(a,count);
        }

        for (int i = 0; i < s.length(); i++) {
            if(1== map.get(chars[i])){
                return i;
            }
        }
        return -1;
    }
}

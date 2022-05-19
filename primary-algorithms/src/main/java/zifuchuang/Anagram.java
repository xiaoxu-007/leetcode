package zifuchuang;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * @author Xu007
 * @create 2022-05-18 10:31
 */
public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map1 = new HashMap<>();
        for (char temp : chars1) {
            int count = map.getOrDefault(temp, 0) + 1;
            map.put(temp, count);
        }
        for (char temp : chars2) {
            int count = map1.getOrDefault(temp, 0) + 1;
            map1.put(temp, count);
        }
        for (int i = 0; i < 26; i++) {
            Integer a = map.get((char) ('a' + i));
            Integer b = map1.get((char) ('a' + i));
            if (a == null) {
                continue;
            }
            if (!a.equals(b)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] letterCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letterCount[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            if(letterCount[t.charAt(i) - 'a']--<0){
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        //对两个字符串中的字符进行排序
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        return Arrays.equals(sChar, tChar);
    }

    public static boolean isAnagram4(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char temp : chars1) {
            int count = map.getOrDefault(temp, 0) + 1;
            map.put(temp, count);
        }
        for (char temp : chars2) {
            int count = map.getOrDefault(temp, 0) - 1;
            if(count<0){
                return false;
            }
            map.put(temp, count);
        }
        return true;
    }
}

package shuzu;

import java.util.*;

/**
 * @author Xu007
 * @create 2022-04-29 13:09
 * 两个数组的交集 II
 * 给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
 */
public class Intersect {
    //1.双指针
    public int[] intersect1(int[] nums1, int[] nums2) {
        //先对两个数组进行排序
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                //如果i指向的值小于j指向的
                //则i往后移动
                i++;
            } else if (nums1[i] > nums2[j]) {
                //同理
                j++;
            } else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        //list转成数组
        int index = 0;
        int[] res = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            res[index++] = list.get(k);
        }
        return res;
    }

    //2.使用map解决
    public int[] intersect2(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        //先把数组nums1的所有元素都存放到map中，其中key是数组中
        //的元素，value是这个元素出现在数组中的次数

        for (int i = 0; i < nums1.length; i++) {
            //getOrDefault: Map集合中有这个key时，就使用这个key对应的value值，如果没有就使用默认值defaultValue
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        //然后再遍历nums2数组，查看map中是否包含nums2的元素，如果包含，
        //就把当前值加入到集合list中，然后再把对应的value值减1。
        for (int i = 0; i < nums2.length; i++) {
            if (map.getOrDefault(nums2[i], 0) > 0) {
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }
        //list转换数组
        int[] res = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            res[k] = list.get(k);
        }
        return res;
    }

    //3.双指针2
    public int[] intersect3(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        int len = Math.min(len1, len2);
        int[] ans = new int[len];
        if (len1 == 0 || len2 == 0) {  //处理边界条件
            return ans;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;
        while (i < len1 && j < len2) {
            if (nums1[i] == nums2[j]) {
                ans[k++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return Arrays.copyOfRange(ans, 0, k);
    }

}


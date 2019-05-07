package com.wan.binarySearch;

/**
 * 二分查找法
 * @author WanMing
 * @date 2019/5/7 10:31
 */

public class BinarySearch {


    /**
     * 数组已经排序了的
     * @param a 数组集合
     * @param b 要搜索的数据
     * @return 要搜索数据的索引
     */
    public static int  binarySort(int [] a,int b){
        //起始索引
        int start = 0;
        //结束索引
        int end = a.length-1;
        while (start<=end){
            //中间索引
            int mid = (start+end)/2;
            if(a[mid]>b){
                end = mid-1;
            }else if (a[mid]<b){
                start=mid+1;
            }else {
                //找到数据
                return mid;
            }
        }

        //不存在
        return -1;
    }
}

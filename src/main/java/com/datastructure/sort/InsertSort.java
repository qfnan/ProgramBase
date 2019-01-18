package com.datastructure.sort;

/**
 * @Author nanqf
 * @Date 2019-01-17 09:56
 * @Description 插入排序：分为两块区域，已排序区和未排序区，排序过程就是将未排序区域元素加入到已排序区，且保证已排序区间稳定;
 * 和冒泡排序的时间复杂度一样均为O(n^2),且均为稳定排序(即元素大小相等时，不更改元素的相应位置),但冒泡排序的排序难度跟逆序度相关，数据量较小时，一般选择插入排序
 * @Version 1.0
 **/
public class InsertSort {

    public int[] main(int[] a){
        if(a.length<=1)
            return a;
        for(int i=1;i<a.length;i++){
            int j=i-1;
            //取出需要排序的元素
            int value=a[i];
            //查找要替换的元素
            for(;j>=0;j--){
                if(a[j]>value){
                    //移动元素
                    a[j+1]=a[j];
                }else {
                    break;
                }
            }
            a[j+1]=value;//插入数据
        }
        return a;
    }
}

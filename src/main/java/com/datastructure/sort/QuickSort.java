package com.datastructure.sort;

/**
 * @Author nanqf
 * @Date 2019-01-18 10:19
 * @Description:快速排序：分治、递归，时间复杂度为O(nLogN)，与归并排序相比，少了合并的操作，为原地排序，空间复杂度为O(1)
 * @Version 1.0
 **/
public class QuickSort {

    //原地分区
    public static int partion(int[] arr,int p,int r){
        int value=arr[r];
        //分为已排序区间和未排序区间，已排序区间下标为p~i,未排序区间为j~r-1
        int i=p,j=p;
        for(;j<r-1;j++){
            if(arr[j]<value){
                //交换arr[i]和arr[j]
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
            }
        }
        //交换arr[i]和最后一个元素
        arr[r]=arr[i];
        arr[i]=value;
        return i;

    }


    public static void sort(int[] arr,int p,int r){
        if(p>=r)
            return;
        //获取分区下标
        int m=partion(arr,p,r);
        sort(arr,p,m);
        sort(arr,m+1,p);
    }


    public static void main(String[] args) {
        int[] arr=new int[]{1,7,0,3,2,9,41,12,5,6,24,11,32,8};
        sort(arr,0,arr.length-1);
        for (int i:arr) {
            System.out.println(i+",");
        }
    }
}

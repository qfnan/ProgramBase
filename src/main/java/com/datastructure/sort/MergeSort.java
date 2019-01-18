package com.datastructure.sort;



/**
 * @Author nanqf
 * @Date 2019-01-17 13:26
 * @Description 归并排序，时间复杂度为O(nLogN)，分而治之的思想，利用递归实现;非常稳定，通过代码可以看出时间复杂度始终为O(nLogN);空间复杂度为O(n),不属于原地排序
 * @Version 1.0
 **/
public class MergeSort {

     public static void mergeBoth(int[] arr,int begin,int mid,int end){
         int size=arr.length;
         int[] result=arr.clone();
         int k=begin,i=begin,j=mid+1;
         //合并数组
         while(i<=mid && j<=end){
             if(arr[i]<arr[j]){
                 result[k]=arr[i];
                 i++;
             }else{
                 result[k]=arr[j];
                 j++;
             }
             k++;
         }
         //拼接尾部
         if(i==mid+1){
             for(;j<=end;j++){
                 result[k]=arr[j];
                 k++;
             }
         }
         if(j==end+1){
             for(;i<=mid;i++){
                 result[k]=arr[i];
                 k++;
             }
         }
//         //合并分区
//         for(int k=begin,i=begin,j=mid+1;i<=(mid+1)&&j<=(end+1);k++){
//             if(i==(mid+1)){
//                 for(;j<=end;k++){
//                     result[k]=arr[j];
//                     j++;
//                 }
//                 break;
//             }
//             if(j==(end+1)){
//                 for(;i<=mid;k++){
//                     result[k]=arr[i];
//                     i++;
//                 }
//                 break;
//             }
//             if(arr[i]>=arr[j]){
//                 result[k]=arr[j];
//                 j++;
//             }else{
//                 result[k]=arr[i];
//                 i++;
//             }
//         }

         for(int m=0;m<arr.length;m++)
             arr[m]=result[m];
     }

     public static void  merge(int[] arr,int begin,int end){
         if(begin>=end)
             return ;
         if((begin+1)==end){
             if(arr[begin]>arr[end]){
                 int temp=arr[end];
                 arr[end]=arr[begin];
                 arr[begin]=temp;
             }
             return;
         }
         int mid=(end+begin)/2;

         //分区间
         merge(arr,begin,mid);
         merge(arr,mid+1,end);
         //合并
         mergeBoth(arr,begin,mid,end);
     }


    public static void main(String[] args) {
        int[] arr=new int[]{1,7,0,3,2,9,41,12,5,6,24,11,32,8};
        merge(arr,0,arr.length-1);
        for (int i:arr) {
            System.out.print(i+",");
        }
    }
}

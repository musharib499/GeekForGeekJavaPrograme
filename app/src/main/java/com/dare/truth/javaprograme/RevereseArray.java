package com.dare.truth.javaprograme;

/**
 * Created by User on 5/2/2017.
 */

public class RevereseArray {

    public static void main(String[] args) {

        int arr[]={12,34,44,54,60,61,70};

        int n=arr.length;
        printArray(arr,"Array");
        reverseArray(arr,0,n-1);
        System.out.println();
        printArray(arr,"ReverseArray");




    }

    public static void reverseArray(int array[],int start,int end)
    {
        int temp;
        if (start >= end)
            return;

        temp=array[start];
        array[start]=array[end];
        array[end]=temp;

        reverseArray(array, start+1, end-1);

    }

    public static void printArray(int arr[],String st)
    {
        System.out.println(st);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+", ");
        }
    }
}

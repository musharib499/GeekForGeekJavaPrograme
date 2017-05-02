package com.dare.truth.javaprograme;

import java.util.ArrayList;

/**
 * Created by User on 5/2/2017.
 */

public class UnsortArrayWithMaxThreeMulipleMaxProd {

    public static void main(String[] args) {
        int arr[] = { 10, 3, 5, 6, 20 };
        int max = multipleArray(arr);
        System.out.println("max value  =  "+max);

    }


    public static int multipleArray(int arr[])
    {
        int n=arr.length;
        int max=0;
        if (n<3)
            return -1;

        for (int i = 0; i <n-2 ; i++) {
            for (int j = i+1; j <n-1 ; j++) {
                for (int k = j+1; k <n ; k++) {
               int  maxValue=arr[i]*arr[j]*arr[k];
                    if (max<maxValue)
                    {
                        max=maxValue;

                    }
                }
            }
        }

        return max;
    }

}

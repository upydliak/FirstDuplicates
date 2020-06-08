package com.ulianapydliak;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	    int[] a = new int[]{2,1,3,5,3,2};
        System.out.println(firstDuplicate(a));
    }

    public static int firstDuplicate(int[] a) {

        int length = a.length;
        int minIndex = -1;

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < length; i++){
            if(set.contains(a[i])){
                    minIndex = i;
                    break;
            }
            else{
                set.add(a[i]);
            }
        }

        if(minIndex == -1){
            return -1;
        }else{
            return a[minIndex];
        }
    }

}

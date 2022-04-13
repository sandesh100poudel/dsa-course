package com;

public class Main {
    public static void main(String[] args){
        int[] nums={12,45,1,2,8,19,-3,16,-11,28};
        int target =13;
        int ans = linearSearch3(nums, target);
        System.out.println(ans);
    }

    //search the target and return true of false
    static boolean linearSearch2(int[] arr, int target ){
        if (arr.length == 0){
            return false;
        }
        for (int element :arr){
            if(element == target){
                return true;
            }
        }
        return false;
    }

    //search in the array:return the element
    static int linearSearch3(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int element :arr){
            if (element ==target){
                return element;
            }
        }
        //this line will execute if none of the return statement above executed
        //hence the target not found
        return Integer.MAX_VALUE;
    }

    //search in the array:return the index if item found
    //otherwise if item not found return -1

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        //run a for loop
        for (int index=0; index<arr.length; index++){
            //check for element at every index if it is = target
            int element =arr[index];
            if(element==target ){
                return index;
            }
        }
        //this line is execute if none of the return statement  above have executed
        //hence the target not found
        return -1;
    }
}

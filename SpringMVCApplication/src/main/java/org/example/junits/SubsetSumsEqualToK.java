package org.example.junits;

public class SubsetSumsEqualToK {

    public boolean subsetSumEqualsToK(int arr[], int n, int k)
    {
        return subsetRecur(n-1, k, n, arr);
    }

    public boolean subsetRecur(int index, int k, int n, int arr[])
    {
        if(k==0)
            return true;

        if(index == 0)
        {
            return arr[index] == k;
        }
        boolean pick = false;
        boolean nopick = subsetRecur(index-1, k, n, arr);
        if(k >= arr[index])
         pick = subsetRecur(index-1, k-arr[index], n, arr);

        return pick || nopick;

    }
    public static void main(String[] args) {

        int n = 4;
        int[] arr = new int[]{1, 10, 5, 4};

        System.out.println(new SubsetSumsEqualToK().subsetSumEqualsToK(arr, 4, 10));

    }
}

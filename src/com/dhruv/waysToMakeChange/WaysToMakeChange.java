package com.dhruv.waysToMakeChange;

public class WaysToMakeChange {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,10,25};
        System.out.println(numberOfWaysToMakeChange(10,arr));
    }
    public static int numberOfWaysToMakeChange(int n, int[] denoms) {
        int[] ways = new int[n+1];
        ways[0] = 1;
        for(int i=0; i<denoms.length; i++){
            for(int j=1; j<=n; j++){
                    if(j >= denoms[i]) {
                        ways[j] += ways[j - denoms[i]];
                    }
            }
        }
        return ways[n];
    }

}

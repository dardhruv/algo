package com.dhruv.goldmannsacha;

public class Divisibility {

static void countPairs(int[] arr,int n,int k){
    int i,j,cnt = 0;
    for(i=0; i < n-1;i++ ){
        for(j=i+1; j<n; j++){
            if((arr[i] -arr[j] +k)%k ==0 ){
                cnt+=1;
            }
        }
    }
    System.out.println(cnt +"\n");
}

static void countPairsEfficiently(int[] arr,int n,int k){
    int cnt = 0;
    for(int i=0; i<n; i++){
        arr[i] = (arr[i] +k)%k;
    }

    int hash[] = new int[k];
    for(int i=0; i<n; i++){
        hash[arr[i]]++;
    }
    for(int i=0; i<k; i++){
        cnt += (hash[i] * (hash[i]-1))/2;
    }
}


    public static void main(String[] args) {
        int[] arr = {3,3,3};

        int k = 3;
        int n = arr.length;

        countPairsEfficiently(arr,n,k);

    }
}

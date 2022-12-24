class Solution {
    public int fib(int n) {

/*
        //Approach1 -- TC:O(2^N) SC:O(N)
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
*/
        //Approach2 -- TC:O(N) SC:O(1)
        if(n==0 || n==1){
            return n;
        }
        int a = 0;
        int b = 1;
        while(n>1){
            int sum = a+b;
            a=b;
            b=sum;
            n--;
        }
        return b;

    }
}
class Solution {
    public int countPermutations(int[] complexity) {

long MOD = (long)1e9 + 7;


        for(int i=1;i<complexity.length;i++){
            if(complexity[i]<=complexity[0]) return 0;
        }

        int n=complexity.length;
        long ans=1;
        for(long i=1;i<n;i++){
            ans=(ans*i)%MOD;
        }
        return (int)ans;
    }
}

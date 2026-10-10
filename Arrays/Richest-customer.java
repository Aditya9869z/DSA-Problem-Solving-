class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
      
        for ( int[] row : accounts  ) {
            int sum = 0;
            for ( int money : row ) {
                sum+= money;
                if ( sum > ans  ) {
                    ans = sum ;
                }
            }
        }
        return ans;
    }
}
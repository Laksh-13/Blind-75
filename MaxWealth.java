//Time Compleixty: O(M *N) where M is the no. of customers and N their bank accounts.
//Space Complexity: O(1)
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        
        for(int[] account : accounts){
            int currCusWealth = 0;
            for(int money : account){
                currCusWealth += money;
            }

            maxWealth = Math.max(maxWealth, currCusWealth);

        }

        return maxWealth;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int buyprice=Integer.MAX_VALUE;
        int n=prices.length;
        int maxprofit=0;
        for(int i=0;i<n;i++){
            if(prices[i]<buyprice){
                buyprice=prices[i];
            }
            else{
            maxprofit=Math.max(maxprofit,prices[i]-buyprice);
            }

        }
        return maxprofit;
        
    }
}

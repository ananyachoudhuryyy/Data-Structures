public class stock {

    static int maxProfit(int[] prices){
           
        int max=0;

        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){

                int profit = prices[j]-prices[i];
                if(profit > max){
                    max= profit;
                }   

            }
        }
        return max;  
    }

    static int maximiseProfit(int[] prices){
        int maxprofit=0;
        int minPrice= Integer.MIN_VALUE;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice)
                   minPrice=prices[i];

        int profit= prices[i]-minPrice;
        if(profit > maxprofit){
            maxprofit=profit;
        }
        }

        return maxprofit;
    }
    public static void main(String[] args) {
        
    }
    
}

/**
 * @author Xu007
 * @create 2022-04-25 21:44
 * 买卖股票的最佳时机 II
 * 
 * 给你一个整数数组 prices ，其中 prices[i] 表示某支股票第 i 天的价格。
 *
 * 在每一天，你可以决定是否购买和/或出售股票。你在任何时候 最多 只能持有 一股 股票。你也可以先购买，然后在 同一天 出售。
 *
 * 返回 你能获得的 最大 利润 。
 *
 */
public class MaxProfit {

    public int maxProfit1(int [] prices){
        int total=0;
        int count;
        for(int i=0;i<prices.length-1;i++){
            count=prices[i+1]-prices[i];
            if(count>0){
                total+=count;
            }
        }
        return total;
    }


    public int maxProfit2(int [] prices){
        int total=0;
        int[] A=new int[prices.length-1];
        for(int i=0;i<prices.length-1;i++){
            A[i]=prices[i+1]-prices[i];
        }

        for(int i=0;i<A.length;i++){
            if(A[i]>0){
                total+=A[i];
            }
        }
        return total;
    }

}

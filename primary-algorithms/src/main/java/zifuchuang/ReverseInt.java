package zifuchuang;

/**
 * @author Xu007
 * @create 2022-05-17 20:28
 */
public class ReverseInt {
    public int reverse(int x){
        int res=0;
        while(x!=0){
            int t=x%10;
            int newRes=res*10+t;
            //如果溢出
            if((newRes-t)/10!=res)
                return 0;
            res=newRes;
            x=x/10;
        }
        return  res;
    }
}

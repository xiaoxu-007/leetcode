package shuzu;

import sun.util.resources.cldr.mas.CurrencyNames_mas;

/**
 * @author Xu007
 * @create 2022-05-16 22:49
 */
public class RotateMatrix {
    public void rotate(int[][] matrix) {
        int length=matrix.length;
        //上下交换;
        for(int i=0;i<length/2;i++){
            int temp[]=matrix[i];
            matrix[i]=matrix[length-i-1];
            matrix[length-i-1]=temp;
        }
        //在按对角线交换
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}

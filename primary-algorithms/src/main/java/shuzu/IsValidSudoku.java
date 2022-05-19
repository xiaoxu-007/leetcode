package shuzu;

/**
 * 请你判断一个 9 x 9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
 * @author Xu007
 * @create 2022-05-16 22:01
 */
public class IsValidSudoku {
    /**
     * 1.直接判断
     * @param board
     * @return
     */
    public boolean isValidSudoku1(char[][] board) {
        int length = board.length;
        int line[][]=new int[length][length];
        int column[][]=new int[length][length];
        int cell[][][]=new int[length/3][length/3][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                char c= board[i][j];
                if(c!='.'){
                    int index=c-'0'-1;
                    line[i][index]++;
                    column[j][index]++;
                    cell[i/3][j/3][index]++;
                    if(line[i][index]>1||column[j][index]>1||cell[i/3][j/3][index]>1){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] a=new char[2][3];
        new IsValidSudoku().isValidSudoku1(a);
    }
}

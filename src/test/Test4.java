package test;

public class Test4 {
    public static void main(String[] args) {
        int[][] score = {{1,2,3,4},
                         {5,6,7,8}};

        int sum = 0;

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
            }
        }
        System.out.println(sum);
    }
}

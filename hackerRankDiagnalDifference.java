package javaBackjoon;

public class hackerRankDiagnalDifference {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        
        int row = input.nextInt();
        
        int leftDiag = 0, rightDiag = 0;
        
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                int val = input.nextInt();
                if(i == j) leftDiag += val;
                if((row - 1) == i + j) rightDiag += val;
            }
        }
        
        System.out.println(leftDiag > rightDiag ? leftDiag - rightDiag : rightDiag - leftDiag);
    }

}

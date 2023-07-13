package Array;

public class Array2D {
    public static void main(String[] args) {
        
        // int nums[] [] = new int [3][2];
        // nums[0][0] = 5;
        // nums[0][1] = 6;
        // nums[1][0] = 2;
        // nums[1][1] = 8;
        // nums[2][0] = 9;
        // nums[2][1] = 7;

        int nums[][] = {
                            {5,6},
                            {8,9},
                            {7,2}
                       };

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(nums[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

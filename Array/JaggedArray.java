package Array;

public class JaggedArray {
    public static void main(String[] args) {
        
        // int nums[][] = new int[3][];
        // nums[0] = new int[4];
        // nums[1] = new int[2];
        // nums[0] = new int[3];
        int nums[][] = {
                         {5,6,9,10},
                         {8,9},
                         {7,2,4}
                       };

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                System.out.print(nums[i][j] + "  ");
            }
            System.out.println();
        }

    }
}

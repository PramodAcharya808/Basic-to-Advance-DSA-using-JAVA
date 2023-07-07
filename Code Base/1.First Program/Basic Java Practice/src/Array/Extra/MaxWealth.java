package Array.Extra;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] bank = {
                {1,2,3},  //1st person
                {4,5,6},  //2nd person
                {7,8,9,6} //3rd person
        };

        int sum, rich=0;

        for(int i=0; i<bank.length; i++){
            sum=0;
            for(int j=0; j<bank[i].length; j++){
                sum = sum+bank[i][j];
            }
            System.out.println("Wealth of Person "+(i+1)+" is "+sum);
//            System.out.println();
            if(sum > rich)
                rich = sum;
        }
        System.out.println("Richest wealth is "+rich);


    }
}

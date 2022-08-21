/** This program prints  the sum of all amicable numbers below 10000*/
public class AmicableNumber {
    //The amicable() returns a boolean value based on whether the  number passed in argument is amicable or not
    public static boolean checkAmicable(int num){
        int i,j,sumOfNum=0,sumOfNum2=0;
        for(i=1;i<=(num/2)+1;i++){
            if(num % i ==  0)
                sumOfNum += i;
        }
        if(sumOfNum != num) {
            for (j = 1; j <= (sumOfNum / 2) + 1; j++) {
                if (sumOfNum % j == 0)
                    sumOfNum2 += j;
            }
            return(num == sumOfNum2);
        }
        else
            return false;
// The main method declaration
    }

    public static void main(String[] args) {
        int i,TotalSum=0;
        //For loop to find the sum of the numbers
        for(i=1;i<=10000;i++){
            if(checkAmicable(i)) {
                TotalSum += i;
            }
        }
        //printing the result
       System.out.println("Sum of all amicable numbers  under 10000 = "+TotalSum);
    }
}

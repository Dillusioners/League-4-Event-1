import java.io.*;
import java.util.*;
class sameDigits {
    public static void main(String args[]) {
        int num = 100;
        for (int i = 0; i < num; i++){
            System.out.println("The number now is " + i);
            int two = num * 2;
            int three = num * 2;
            int four = num * 2;
            int five = num * 2;
            int six = num * 2;

            String str1 = num + "";
            String str2 = two + "";
            String str3 = three + "";
            String str4 = four + "";
            String str5 = five + "";
            String str6 = six + "";

            char[] chars1 = str1.toCharArray();
            char[] chars2 = str2.toCharArray();
            char[] chars3 = str3.toCharArray();
            char[] chars4 = str4.toCharArray();
            char[] chars5 = str5.toCharArray();
            char[] chars6 = str6.toCharArray();

            Arrays.sort(chars1);
            Arrays.sort(chars2);
            Arrays.sort(chars3);
            Arrays.sort(chars4);
            Arrays.sort(chars5);
            Arrays.sort(chars6);
        
            boolean check1 = Arrays.equals(chars1,chars2);
            boolean check2 = Arrays.equals(chars1,chars3);
            boolean check3 = Arrays.equals(chars1,chars4);
            boolean check4 = Arrays.equals(chars1,chars5);
            boolean check5 = Arrays.equals(chars1,chars6);

            boolean check6 = Arrays.equals(chars2,chars3);
            boolean check7 = Arrays.equals(chars2,chars4);
            boolean check8 = Arrays.equals(chars2,chars5);
            boolean check9 = Arrays.equals(chars2,chars6);

            boolean check10 = Arrays.equals(chars3,chars4);
            boolean check11 = Arrays.equals(chars3,chars5);
            boolean check12 = Arrays.equals(chars3,chars6);

            boolean check13 = Arrays.equals(chars4,chars5);
            boolean check14 = Arrays.equals(chars4,chars6);

            boolean check15 = Arrays.equals(chars5,chars6);

            if(check1 && check2 && check3 && check4 && check5 && check6 && check7 && check8 && check9 && check10 && check11 && check12 && check13 && check14 && check15){
                System.out.println("The number " + i + " is the smallest number.");//The number came 125774.
                break;
            }
            else{
                num++;
            }

        }

    }
}

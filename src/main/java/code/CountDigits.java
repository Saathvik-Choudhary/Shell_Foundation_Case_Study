package code;

public class CountDigits {
    public static int countDigits(int number)
    {
        if(number<0)
            number*=-1;
        int count=0;
        while(number>10)
        {
            count++;
            number/=10;
        }
        count++;

        return(count);
    }
    //
}
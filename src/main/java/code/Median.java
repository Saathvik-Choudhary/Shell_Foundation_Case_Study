package code;

public class Median {
    public static float median(float[] n)
    {
        int l=n.length;
        if(l%2==0)
        {
            float median=((n[l/2]+n[l/2-1])/2)*10;
            median=Math.round(median);
            return(median/10);//multiplying and dividing with 10 to retain the tenths place
        }
        return(n[l/2]);
    }
}

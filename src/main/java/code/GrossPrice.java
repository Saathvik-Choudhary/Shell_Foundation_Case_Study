package code;

public class GrossPrice {
    public static double gross_price(final double  net_price, final double taxRate)
    {
        double grossPrice=net_price/(taxRate+1);
        return(grossPrice);
    }
}
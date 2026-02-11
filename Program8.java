
//Write a java program to calculate  simple intrest using the given data 
    public class Program8{
public static void main (String[] args){
    double principle=100000.0;
    int tenure =2;
    double rate=11.5;
    double simpleIntrest=(principle*tenure*rate)/100;
    System.out.println("simple Intrest : "+simpleIntrest);
    double total_repayment =principle+ simpleIntrest;
    System.out.println("Total repayment for the loan is :"+total_repayment);
    double emi =total_repayment /(tenure*12);
    System.out.println("Emi for payment :"+emi);
}

    }


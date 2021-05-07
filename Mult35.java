/*
Find the sum of all the multiples of 3 or 5 below 1000.
using a sum identity.
 */
public class Mult35
{
    public void run()
    {
    int threeSum = three();
    double fiveSum = five();
    double overcount = Overcount();

    //answer
    System.out.print(threeSum + fiveSum - overcount);

    }

    //Sum of mult three
    public  int three()
    {
        int n = 333;
        int a = 3;
        int d = 3;

        int p1 = 2 * a;
        int p2 = (n - 1) * d;
        int p3 = p1 + p2;
        int p4 = n * p3;
        return p4 / 2;
    }
    //Sum of mult five
    public double five()
    {
        int n = 999 / 5;
        int a = 5;
        int d = 5;

        double p1 = 2 * a;
        double p2 = (n - 1) * d;
        double p3 = p1 + p2;
        double p4 = n * p3;
        return p4 / 2;


    }
    //Sum of over count of n1 | n2
    public double Overcount()
    {
        int n = 999 / 15;
        int a = 15;
        int d = 15;

        double p1 = 2 * a;
        double p2 = (n - 1) * d;
        double p3 = p1 + p2;
        double p4 = n * p3;
        return p4 / 2;


    }
}

/*
Find the difference between the sum of
the squares of the first one hundred natural
numbers and the square of the sum.
*/
public class Sumsqrdiff
{
    public void run()
    {
        int sum1 = sumOfSqr();
        int sum2 = sqrOfSum();
        System.out.print(sum2 - sum1);
    }
    //sum of the sqr of the first 100 in N
    public int sumOfSqr()
    {
        int i = 1;
        int sqrsum = 0;

        while (i < 101)
        {
            sqrsum  = sqrsum + (i * i);

            i++;
        }
        return sqrsum;
    }

    //Sqr of sum for  the first 100 in N
    public int sqrOfSum()
    {
        int i = 0;
        int sumsqr = 0;
        while(i < 101)
        {
            sumsqr = sumsqr + i;
            i++;
        }
        return sumsqr * sumsqr;
    }
}

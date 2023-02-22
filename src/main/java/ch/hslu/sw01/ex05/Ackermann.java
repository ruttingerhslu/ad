package ch.hslu.sw01.ex05;

public class Ackermann {
    static int ack(int n, int m)
    {
        if (n == 0)
        {
            return m + 1;
        }
        else if((n > 0) && (m == 0))
        {
            return ack(n - 1, 1);
        }
        else if ((n > 0) && (m > 0))
        {
            return ack(n - 1, ack(n, m - 1));
        } else
            return m + 1;
    }
}

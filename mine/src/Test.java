
class Solution
{
    public static int a = 99;
    public static int i = 100;

    public static void main(String[] args)
    {
        int[] a = new int[i];
        for (int i = 0; i < 10; i++)
        {
            a[i] = a;
        }
    }
}
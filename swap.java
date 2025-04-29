class swap
{
    public static void main(String args[])
    {
        int a=2, b=9;
        System.out.println("Before SWAP : ");
        System.out.println("The value of a is "+a+" and b is "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After SWAP : ");
        System.out.println("The value of a is "+a+" and b is "+b);
    }
}

class stringhash
{
    public static void main(String args[])
    {
        String s="";
        int len=s.length();
        if(len<3)
        {
            int b=3-len;
            System.out.print(s);
            for(int i=0;i<b;i++)
            {
                System.out.print("#");
            }
        }
        else
        {
            System.out.print(s);
        }
    }
}

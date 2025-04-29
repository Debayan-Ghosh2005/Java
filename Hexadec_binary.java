class Hexadec_binary
{
    public static void main(String args[])
    {
        int n=15;
        String s="";
        while(n>0)
        {
            int r=n%16;
            if(r==10)
            {
                s='A'+s;
            }
            else if(r==11)
            {
                s='B'+s;
            }
            else if(r==12)
            {
                s='C'+s;
            }
            else if(r==13)
            {
                s='D'+s;
            }
            else if(r==14)
            {
                s='E'+s;
            }
            else if(r==15)
            {
                s='F'+s;
            }
            else{
                s=r+s;
            }
            n=n/16;
        }
        System.out.println("HexaDecimal : "+s);
    }
}

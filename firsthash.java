class firsthash{
    public static void main(String args[]) {
        String s1="Python";
        String s2="";
        String ans="";
        int l1=s1.length();
        int l2=s2.length();
        if(l1==0 && l2!=0) {
            ans="#"+s2.charAt(l2-1);
        }
         else if(l2==0 && l1!=0) {
            ans=s1.charAt(0)+"#";
        }
        else if(l1==0 && l2==0) {
            ans="##";
        }
        else {
            ans=""+s1.charAt(0)+s2.charAt(l2-1);
        }
        System.out.println(ans);
    }
}

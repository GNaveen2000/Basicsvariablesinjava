class E{
    public static void main(String [] args)
{    int a=123,r,sum=0,temp;
    temp=a;
    while(a>0)
    {
        r=a%10;
        sum=sum*10+r;
        a=a/10;

    }
if(sum==temp)
{
    System.out.println("palindrome");
}
else{
    System.out.println("not a palendrom");
}
}
}

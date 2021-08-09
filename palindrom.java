class B
{
    public static void main(String[] args)
{
        int a=151,temp,sum=0,n;
        temp=a;
while(a>0)
{
n=a%10;
sum=sum*10+n;
a=a/10;
}
if(temp==sum)
{
    System.out.println("number is palindrome");
}
else{
    System.out.println("not palindrome number");
}
}
}

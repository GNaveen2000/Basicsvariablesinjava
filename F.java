class F
{
    int a=1;
    char c;
    float d;
    String e;
    public static void main(String[] args)
    {
        F f1=new F();
        
        System.out.println(f1.a);
        System.out.println(f1.c);
        System.out.println(f1.d);
        m1();
        F f2=new F();
        f2.c='c';
        System.out.println(f2.c);
        System.out.println(f2.e);

    }
    public static void m1()
    {
        F f3=new F();

        System.out.println("naveen");
    
        System.out.println(f3.a);



    }
}
class Marvellous
{
    public int i , j;
    public Marvellous(int a , int  b) // parameterized constructor , constructor named should be same as class name 
    {
        this.i = a;
        this.j = b;
    }
}
class DemoGetClass
{
    public static void main(String args[])
    {
        Marvellous mobj1 = new Marvellous(11, 21);
        Marvellous mobj2 = new Marvellous(11, 21);

        System.out.println(mobj1.getClass());  // class che nave denar , nava she class Marvellous
        System.out.println(mobj2.getClass());
    }
}

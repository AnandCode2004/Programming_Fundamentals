class Marvellous
{
    public int i,j;
    public  Marvellous(int a , int b)
    {
        this.i = a;
        this.j = b;
    }
    
    protected void finalize()
    {
        System.out.println("inside the finalize");
    }
}

class DemoFinalize
{
    public static void main(String args[])
    {
        Marvellous mobj1 = new Marvellous(11,21);  /* don chiken tahli maghavlya new Marvellous mala ani mazya mitrala */
        Marvellous mobj2 = new Marvellous(11,21);

        mobj1 = null; /* maza jevan zala mi palte theun deli*/
        mobj2 = null; /* dusray cha jevan zala */

        System.gc();  /* we request garbage collector but we can't predict when it will come v */

        System.out.println("end of main");
    }
}

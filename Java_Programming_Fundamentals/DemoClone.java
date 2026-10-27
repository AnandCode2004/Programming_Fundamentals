class Marvellous implements Cloneable
{
    public int i,j;
    public  Marvellous(int a , int b)  // parameterized constructor , constructor named should be same as class name 
    {
    {
        this.i = a;
        this.j = b;
    }
    
    public Object Clone() throws CloneNotSupportedException
    {
        return  super.clone();
    }
}

class DemoClone
{
    public static void main(String args[]) throws CloneNotSupportedException


    {
        Marvellous mobj1 = new Marvellous(11,21);  
        Marvellous mobj2 = (Marvellous)mobj1.Clone(); // makes copy of 11 , 21

        System.out.println(mobj1.i +","+ mobj1.j);
        System.out.println(mobj2.i +","+ mobj2.j);
     


    }
}

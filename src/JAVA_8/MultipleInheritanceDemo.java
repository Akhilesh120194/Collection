package JAVA_8;

interface Car
{
    public default void drive()
    {
        System.out.println("Car is driving");
    }
}
interface Jeep
{
    public default void drive()
    {
        System.out.println("Jeep is driving");
    }
}
public class MultipleInheritanceDemo implements Car,Jeep
{
    @Override
    public void drive()
    {
        Jeep.super.drive();
    }
    public static void main(String args[])
    {
    	MultipleInheritanceDemo v = new MultipleInheritanceDemo();
        v.drive();
    }
}
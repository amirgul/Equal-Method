public class Main
{

    public static void main(String[] args)
    {

        Species object1 = new Species();
        Species object2 = new Species();
        object1.setSpecies("tiger", 100.0);
        object2.setSpecies("tiger", 10.0);
        if(object1.equals(object2))
        {
            System.out.println("They are equal by equal method");
        }
        else
            System.out.println("They are not equal");

        if(object1.olderEquals(object2))
            System.out.println("Object 1 is older");

    }
}

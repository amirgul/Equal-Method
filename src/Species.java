public class Species
{
    private String name;
    private double population;


    public void setSpecies(String newName, double newPopulation)
    {
        name = newName;
        population = newPopulation;

    }

    public boolean equals(Species otherObject)
    {
               return  this.name.equalsIgnoreCase(otherObject.name)&&
                       this.population == otherObject.population;
    }

    public boolean olderEquals(Species olderObject)
    {
        return this.population < olderObject.population;
    }
}

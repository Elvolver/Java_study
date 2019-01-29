package Java_study.Patterns.AbstractFactory.Furniture;

public abstract class CoffeeTable implements Furniture {
    public boolean equals(Object obj)
    {
        if(obj == this)
            return true;

     /* obj ссылается на null */
        if(obj == null)
            return false;

     /* Удостоверимся, что ссылки имеют тот же самый тип */
        if(!(getClass() == obj.getClass()))
            return false;
        else
        {
            CoffeeTable tmp = (CoffeeTable)obj;
            return (
                    (tmp.getComfortLevel().equals(((CoffeeTable) obj).getComfortLevel()))
                    && (tmp.getMaterial().equals(((CoffeeTable) obj).getMaterial()))
                    );
        }
    }
}

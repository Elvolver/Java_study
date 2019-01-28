package Java_study.Furniture;

public abstract class Chair implements Furniture {
    public boolean isSoft() {
        return false;
    }

    public boolean hasArmrest() {
        return false;
    }

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
            Chair tmp = (Chair)obj;
            return ((tmp.hasArmrest() == this.hasArmrest())
                    && (tmp.getComfortLevel().equals(((Chair) obj).getComfortLevel()))
                    && (tmp.getMaterial().equals(((Chair) obj).getMaterial()))
                    && (tmp.hasArmrest() == ((Chair) obj).isSoft())
            );
        }
    }
}

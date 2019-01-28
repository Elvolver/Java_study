package Java_study.ObjectEquals;

public class Circle {
    private Integer radius = 5;

    public Circle(Integer radius) {
        this.radius = radius;
    }
    public Integer getRadius() {
        return radius;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        } else {
            Circle other = (Circle)obj;
            return (this.getRadius().equals(other.getRadius()));
        }
    }
}

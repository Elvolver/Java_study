package Java_study.Patterns.Adapter;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    private static double getRadiusFromWidth(double width) {
        return Math.sqrt(Math.pow(width, 2)/2);
    }

    public SquarePegAdapter(SquarePeg peg) {
        super(getRadiusFromWidth(peg.getWidth()));
        this.squarePeg = peg;
        double width = squarePeg.getWidth();
    }
}

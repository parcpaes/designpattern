package FittingSquareintoRoundHoles.adapter;

import FittingSquareintoRoundHoles.round.RoundPeg;
import FittingSquareintoRoundHoles.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result = (peg.getWidth()*Math.sqrt(2))/2;
        return result;
    }
}

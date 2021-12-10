package FittingSquareintoRoundHoles;

import FittingSquareintoRoundHoles.adapter.SquarePegAdapter;
import FittingSquareintoRoundHoles.round.RoundHole;
import FittingSquareintoRoundHoles.round.RoundPeg;
import FittingSquareintoRoundHoles.square.SquarePeg;

public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if(hole.fits(rpeg)){
            System.out.println("Rounded peg radius 5");
        }

        SquarePeg exactSqPeg = new SquarePeg(7.0710);
        SquarePeg largeSqPeg = new SquarePeg(20);
        SquarePegAdapter exactSqPegAdapter = new SquarePegAdapter(exactSqPeg);
        if(hole.fits(exactSqPegAdapter)){
            System.out.println("Square peg fits round hole radius 5");
        }
    }
}

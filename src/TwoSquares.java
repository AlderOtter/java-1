import com.judahstutorials.javaintro.tools.Turtle;
public class TwoSquares
{
    // Draw two 40x40 squares side by side, 10 pixels apart.
    public static void main (String[ ] args)
    {
        Turtle sue = new Turtle();
        sue.paint (90, 40); // draw the right side of square #1
        sue.paint (90, 40); // draw the top of square #1
        sue.paint (90, 40); // draw the left side of square #1
        sue.paint (90, 40); // draw the bottom of square #1
        sue.move (0, 50); // move 50 pixels to the right
        sue.paint (90, 40); // draw the right side of square #2
        sue.paint (90, 40); // draw the top of square #2
        sue.paint (90, 40); // draw the left side of square #2
        sue.paint (90, 40); // draw the bottom of square #2
    } 
    //======================
}
import com.judahstutorials.javaintro.tools.Vic;

public class SmartVicDemo
{
	public static void main(String[] args)
	{
        Vic.reset( args );
        SmartVic tim = new SmartVic();
        tim.moveTake();
        tim.moveTake();
        tim.backPut();
        tim.backPut();
	}
}
// java SmartVicDemo 011 #0
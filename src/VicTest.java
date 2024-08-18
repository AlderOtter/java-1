import com.judahstutorials.javaintro.tools.Vic;

public class VicTest
{
    public static void main(String[] args)
	{
		Vic.reset( args );
		Vic pub = new Vic();
		Vic gub = new Vic();
		Vic tub = new Vic();
		
		pub.takeCD();
		pub.moveOn();
		pub.moveOn();
		pub.moveOn();
		pub.moveOn();
		pub.putCD();
		pub.moveOn();
		
		gub.takeCD();
		gub.moveOn();
		gub.takeCD();
		gub.moveOn();
		gub.takeCD();
		gub.moveOn();
		gub.takeCD();
		gub.moveOn();
		gub.takeCD();
		gub.moveOn();
		
		tub.putCD();
		tub.moveOn();
		tub.putCD();
		tub.moveOn();
		tub.putCD();
		tub.moveOn();
		tub.putCD();
		tub.moveOn();
		tub.putCD();
		tub.moveOn();
	}
}
//java VicTest 10000 11111 00000 #0
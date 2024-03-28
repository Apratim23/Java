public class Main5 {
public static void main(String[] args)
{
	Carr car=new Carr();
	car.go();
	Bicycle bike=new Bicycle();
	bike.stop();
	System.out.println(car.speed);
	System.out.println(bike.speed);
	System.out.println(car.doors);
	System.out.println(bike.pedals);
	//System.out.println(car.pedals); not possible
	//System.out.println(bike.doors); not possible

}
}

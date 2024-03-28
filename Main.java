public class Main 
{
 public static void main(String[] args)
 {
	 Car mycar1=new Car();
	 System.out.println(mycar1.model);
	 System.out.println(mycar1.make);
	 System.out.println(mycar1.color);
	 System.out.println(mycar1.model);
	 Human human1=new Human("Rick",65,72);
	 Human human2=new Human("Morty",16,45);
	 human2.eat();
	 human1.drink();
	 System.out.println(human1.name);
	 System.out.println(human2.name);
    Pizza pizza=new Pizza("thicc crust","tomato");
    System.out.println("Here are the ingredients of your pizza");
    System.out.println(pizza.bread);
    System.out.println(pizza.sauce);
    System.out.println(pizza.cheese);
    System.out.println(pizza.topping);
    Bike bike=new Bike();
	 System.out.println(bike.model);
	 System.out.println(bike.make);
	 System.out.println(bike.color);
	 System.out.println(bike.year);
	 System.out.println(bike.toString());//the next line is explicitly
	 System.out.println(bike);//the previous line is implicitly
	 
	 
}
}

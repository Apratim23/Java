
public class NumberFormatExceptionDemo {
public static void main(String args[])
{
	try{
		String str="abc";
		int num=Integer.parseInt(str);
		System.out.println(num);
	}
	catch(NumberFormatException e){
		System.out.println(e.getMessage());
	}
	finally
	{
		System.out.println("Normally executed");
	}
}
}
